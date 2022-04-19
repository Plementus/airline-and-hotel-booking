/********************************************/
//	7/21/15 12:20 AM - Ibrahim Olanrewaju.
/********************************************/

package core;

import core.interfaces.EbeanPaginator;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;
import play.mvc.Http;
import play.twirl.api.Html;

import java.lang.reflect.Field;
import java.util.List;
import javax.persistence.*;

public class EbeanPagination<T> extends PaginationAbstract<T> {

    private EbeanPaginator ebeanPaginator;

    public int count;

    private String tableName;

    private String pKey;

    public Class<?> modelClass;

    public Sql query;



    public String urlTitle = "page";

    private int paginationAdapeter;

    public SqlQuery q;

    public EbeanPagination(EbeanPaginator obj, int paginationAdapeter) {
//        super(Http.Context.current().request());

        this.ebeanPaginator = obj;

        this.paginationAdapeter = paginationAdapeter;

        if (currentPage == 0) {
            this.currentPage = 1;
        }

        this.modelClass = this.ebeanPaginator.model();

        this.query = this.ebeanPaginator.query();

        if (paginationAdapeter == 1) {
            String sql = this.query.toSql() + " LIMIT " + this.currentPage + ", " + this.recordPerPage;
            this.q = Ebean.createSqlQuery(sql);
        } else if (paginationAdapeter == 2) {
            for (Field f : this.modelClass.getDeclaredFields()) {
                if (f.isAnnotationPresent(Id.class)) {
                    //if the annotation has a column of name.
                    if (f.isAnnotationPresent(Column.class)) {
                        this.pKey = f.getAnnotation(Column.class).name();
                    } else {
                        this.pKey = f.getName();
                    }
                }
                Object instance = null;
                try {
                    instance = this.modelClass.newInstance();
                } catch (IllegalAccessException | InstantiationException e) {

                }
            }
        } else {
            throw new NullPointerException("Invalid Pagination Adapter Specified. Use Instance the int value of Pagination.PaginationAdapters interface");
        }

        this.count = this.getNumberOfRecord();

   }


    public List<SqlRow> paginate() {

        if (this.getNumberOfRecord() == 0) {
            this.count = 0;
            return null;
        }
        return this.q.findList();
    }

    public int getNumberOfRecord() {
        if (this.paginationAdapeter == 1) {
            int record = this.q.findList().size();
            this.count = record;
            return this.count;
        } else {
            return 0;
        }
    }



    public interface PaginationAdapters {
        public static final int cSQL = 1;
        public static final int eBean = 2;
    }
}
