/**
 * **********************************************************************************
 */
//	8/13/15 1:30 AM - Ibrahim Olanrewaju.
/********************************************/

package core.interfaces;

import core.Sql;
import com.avaje.ebean.Model;

public interface EbeanPaginator<T extends Model> {

    Class<? extends Model> model();

    T getModel(T model);

    Sql query();

}
