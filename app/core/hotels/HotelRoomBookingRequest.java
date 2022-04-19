package core.hotels;

import models.Hotels;
import models.PaymentMethods;
import models.TransRefs;

/**
 * Created by
 * Ibrahim Olanrewaju. on 25/03/2016 8:15 PM.
 */
public class HotelRoomBookingRequest {
    private int roomId;
    private int searchId;
    private int hotelWsId;
    private Hotels hotelId;
    private HotelDataPresentationInterface hotelInfo;
    private String title;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String phone;
    private String address;
    private String zipCode;
    private String city;
    private PaymentMethods paymentMethod;
    private TransRefs tfxBookingReference;

    public PaymentMethods getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethods paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    public Hotels getHotelId() {
        return hotelId;
    }

    public void setHotelId(Hotels hotelId) {
        this.hotelId = hotelId;
    }

    public int getHotelWsId() {
        return hotelWsId;
    }

    public void setHotelWsId(int hotelWsId) {
        this.hotelWsId = hotelWsId;
    }

    public int getSearchId() {
        return searchId;
    }

    public void setSearchId(int searchId) {
        this.searchId = searchId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public HotelDataPresentationInterface getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(HotelDataPresentationInterface hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TransRefs getTfxBookingReference() {
        return tfxBookingReference;
    }

    public void setTfxBookingReference(TransRefs tfxBookingReference) {
        this.tfxBookingReference = tfxBookingReference;
    }
}
