package core.hotels;

import models.HotelFacilities;
import models.HotelPhotos;
import models.HotelSuppliers;
import models.Hotels;
import play.Logger;
import play.cache.Cache;
import play.libs.F;
import scala.Unit;
import services.roombookpro.client.RoomBookProClient;
import services.roombookpro.messages.HotelSearchRequest;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 02/03/2016 9:48 AM
 * |
 **/
public abstract class HotelEngineEngineServices implements HotelEngineServicesInterface<HotelDataPresentationInterface> {

    protected static final int CACHE_DURATION = 60 * 60;
    protected static final String BOOKING_ENGINE_KEY = "ht_book_results";
    protected List<HotelDataPresentationInterface> data;

    @Override
    public List<HotelDataPresentationInterface> get() {
//        if (Cache.get(BOOKING_ENGINE_KEY).getClass().isInstance(List.class)) {
        data = (List<HotelDataPresentationInterface>) Cache.get(BOOKING_ENGINE_KEY);
//        }
//        if (data == null) {
//            data = new ArrayList<>();
//        }
        return data;
    }

    @Override
    public HotelDataPresentationInterface get(int searchId, int hotelId) {
        HotelDataPresentationInterface data = null;
        for (HotelDataPresentationInterface forItem : get()) {
            if (forItem.getHotel().getSearchID().equals(searchId) && forItem.getHotel().getID().equals(hotelId)) {
                data = forItem;
            }
        }
        return data;
    }

    @Override
    public HotelEngineEngineServices searchHotels(HotelSearchRequest request) {
        F.Promise<List<HotelDataPresentationInterface>> roomBookHotelSearch = RoomBookProClient.roomBookHotelSearch(request);
        roomBookHotelSearch.map(this::cacheResult);
        return new RoomBookProHotelEngine();
    }

    @Override
    public List<HotelDataPresentationInterface> cacheResult(List<HotelDataPresentationInterface> data) {
        Cache.set(BOOKING_ENGINE_KEY, data, CACHE_DURATION);
        F.Promise.pure(this.saveHotels(data));
        return data;
    }

    /**
     * Save record of the hotels to the database.
     * Save all hotel too the database if not exists. I.e all display hotels should have a replicated in the database.
     */
    public List<Hotels> saveHotels(List<HotelDataPresentationInterface> hotelRecords) {
        List<Hotels> dbHotelRecords = Hotels.find.all();
        if (dbHotelRecords.size() <= 0) {
            hotelRecords.forEach(this::dbSave);
        }
        for (Hotels dbHotelRecord : dbHotelRecords) {
            for (HotelDataPresentationInterface wsHotelRecord : hotelRecords) {
                if (!Objects.equals(dbHotelRecord.hotel_ws_id, wsHotelRecord.getHotel().getID())) {
                    dbSave(wsHotelRecord);
                }
            }
        }
        return dbHotelRecords;
    }

    private void dbSave(HotelDataPresentationInterface wsHotelRecord) {
        //save the hotel if it doesn't exists.
        Hotels hotel = new Hotels();
        hotel.hotel_supplier_id = HotelSuppliers.find.where().eq("supplier_name", this.bookingEngine().name()).findUnique();
        hotel.hotel_ws_id = wsHotelRecord.getHotel().getID();
        hotel.name = wsHotelRecord.getHotel().getName();
        hotel.description = wsHotelRecord.getHotel().getDescription();
        hotel.code = wsHotelRecord.getHotel().getCode();
        hotel.rating = wsHotelRecord.getHotel().getRating();
        hotel.latitude = wsHotelRecord.getHotel().getLatitude();
        hotel.longitude = wsHotelRecord.getHotel().getLongitude();
        hotel.location = wsHotelRecord.getHotel().getLocation();
        hotel.address = wsHotelRecord.getHotel().getAddress1();
        hotel.city = wsHotelRecord.getHotel().getCity();
        hotel.is_active = true;
        hotel.insert();

        wsHotelRecord.getImages().forEach(image -> {
            HotelPhotos hotelPhotos = new HotelPhotos();
            hotelPhotos.file_url = image.getUrl();
            hotelPhotos.hotel_id = hotel;
            hotelPhotos.insert();
        });

        wsHotelRecord.getFacilities().forEach(facility -> {
            HotelFacilities hotelFacilities = new HotelFacilities();
            hotelFacilities.name = facility.getName();
            hotelFacilities.hotel_id = hotel;
            hotelFacilities.insert();
        });
    }
}