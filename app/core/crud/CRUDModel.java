package core.crud;

import com.avaje.ebean.Model;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/10/15 1:53 PM
 * |
 **/

@FunctionalInterface
public interface CRUDModel {
    Class<? extends Model> setModel();
}