package core.hotels;

/**
 * Created by
 * Ibrahim Olanrewaju. on 25/03/2016 8:11 PM.
 */
public interface HotelRoomBookingResponse {

    String getRef();

    void setRef(String ref);

    String getAgentRef();

    void setAgentRef(String agentRef);

    String getStatus();

    void setStatus(String status);

    String getSupplierRef();

    void setSupplierRef(String supplierRef);

    String getHotelConfirmationRef();

    void setHotelConfirmationRef(String hotelConfirmationRef);

}