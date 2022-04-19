package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 14/03/2016 12:46 PM
 * |
 **/
@Entity
@SoftDelete
public class HotelPriceHistory extends MyModel{
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "hotel_id")
    public Hotels hotel_id;
    @Column(columnDefinition = "TIMESTAMP NULL")
    public Date date_time;
    public Double hotel_price;
    public String currency;
    public static final MyModel.Finder<Long, HotelPriceHistory> find = new MyModel.Finder<>(Long.class, HotelPriceHistory.class);
}