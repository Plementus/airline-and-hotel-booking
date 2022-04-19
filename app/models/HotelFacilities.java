package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 13/03/2016 12:19 AM
 * |
 **/
@Entity
@SoftDelete
public class HotelFacilities extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "hotel_id")
    public Hotels hotel_id;
    public String name;
    public static final MyModel.Finder<Long, HotelFacilities> find = new MyModel.Finder<>(Long.class, HotelFacilities.class);
}