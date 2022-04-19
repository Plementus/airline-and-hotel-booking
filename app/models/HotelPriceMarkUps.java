package models;

import javax.persistence.Entity;

/**
 * Created by
 * Ibrahim Olanrewaju. on 23/03/2016 10:27 AM 10:28 AM.
 */
@SoftDelete
@Entity
public class HotelPriceMarkUps extends MyModel {

    public static final MyModel.Finder<Long, HotelPriceMarkUps> find = new MyModel.Finder<>(Long.class, HotelPriceMarkUps.class);
}
