package models;

import core.hotels.HotelApiProviders;
import core.hotels.HotelDataPresentationInterface;

import javax.persistence.*;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 13/03/2016 12:09 AM
 * |
 **/
@Entity
@SoftDelete
public class Hotels extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "hotel_supplier_id")
    public HotelSuppliers hotel_supplier_id;
    public Integer hotel_ws_id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "state_id")
    public States state_id;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String name;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String description;
    public String code;
    public String rating;
    public String last_check_in;
    public String last_check_out;
    public int no_of_likes;
    public int no_of_view;
    public int no_of_visits;
    public Double latitude;
    public Double longitude;
    public String location;
    public String address;
    public String city;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
    public boolean is_active;
    @OneToMany
    public List<HotelFacilities> hotelFacilitiesList;
    @OneToMany
    public List<HotelPhotos> hotelPhotosLists;
    public static final MyModel.Finder<Long, Hotels> find = new MyModel.Finder<>(Long.class, Hotels.class);


}