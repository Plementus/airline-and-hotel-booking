package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 13/03/2016 12:13 AM
 * |
 **/
@Entity
@SoftDelete
public class HotelPhotos extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "hotel_id")
    public Hotels hotel_id;
    public String file_url;
    public static final MyModel.Finder<Long, HotelPhotos> find = new MyModel.Finder<>(Long.class, HotelPhotos.class);
}