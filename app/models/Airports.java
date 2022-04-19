package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import play.cache.Cache;
import play.libs.Json;
import play.twirl.api.Html;

import javax.persistence.*;
import java.lang.reflect.Field;
import java.util.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/17/15 9:30 PM
 * |
 **/

@Entity
@SoftDelete
public class Airports extends MyModel {
    public String state;
    public String city;
    public String air_code;
    public String airport_name;
    public String country_name;
    public String country_code;
    public String latitude;
    public String longitude;
    public String time_zone;
    public String icao_code;
    public String direct_flights;
    public String carriers;
    public String runway_length;
    public String type;
    public String airport_desc;
    @Enumerated
    public AirportCategory airport_category;
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    @ManyToOne
    public Countries country_id;
    //    @SoftDelete
//    public boolean deleted;
    @JoinColumn(name = "state_id", referencedColumnName = "id")
    @ManyToOne
    public States state_id;
    public String area_code;
    public static final MyModel.Finder<Long, Airports> find = new Finder<>(Long.class, Airports.class);


    public static List<Airports> getAirports() {
        List<Airports> airportList = (List<Airports>) Cache.get("airports");
        if (airportList == null)
            airportList = Airports.find.all();
        return airportList;
    }

    public static Airports getAirports(String airportCode) {
        for (Airports airport : getAirports()) {
            if (airport.air_code.equalsIgnoreCase(airportCode)) {
                return airport;
            }
        }
        return null;
    }

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap<>();
        for (Airports types : getAirports()) {
            opt.put(types.id.toString(), types.air_code + " (" + Html.apply(types.airport_name) + ")");
        }
        return opt;
    }

}
