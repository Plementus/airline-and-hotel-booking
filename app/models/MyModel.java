package models;

import com.avaje.ebean.*;
import com.avaje.ebean.OrderBy;
import com.avaje.ebean.Query;
import com.avaje.ebean.text.PathProperties;
import com.avaje.ebean.util.ClassUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import controllers.abstracts.BaseController;
import play.Logger;
import play.libs.Json;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.*;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 21/02/2016 9:46 AM
 * |
 **/

@MappedSuperclass
public abstract class MyModel extends Model implements Serializable {
    public MyModel() {
        super();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column(columnDefinition = "VARCHAR(20) DEFAULT '1.0.1'")
    public Long version = 1L;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    public Date updated_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    public Date created_at;
    @Column(columnDefinition = "TIMESTAMP NULL")
    public Date deleted_at;
    public boolean deleted;

    public void delete() {
        if (this.getClass().isAnnotationPresent(SoftDelete.class)) {
            this.deleted = true;
            db().update(this);
        } else {
            db().delete(this);
        }
    }

    public abstract static class Find<I, T> extends Model.Find<I, T> {

        private Class<T> modelClass;

        private Class<I> pkClass;

        private String serverName;

        private SoftDelete softDelete;

        private String softDeleteField;

        private static final Object softDeleteCondition = 1;

        private String pkField;

        private boolean isSoftDelete = false;

        private void initialize() {
            if (this.modelClass.isAnnotationPresent(SoftDelete.class)) {
                softDelete = this.modelClass.getAnnotation(SoftDelete.class);
                softDeleteField = softDelete.field();
                isSoftDelete = true;
            }
            pkField = MyModel.class.getDeclaredFields()[0].isAnnotationPresent(Id.class) ? MyModel.class.getFields()[0].getName() : "id";
        }

        protected Find(String serverName, Class<T> type) {
            super(serverName, type);
            this.modelClass = type;
            this.serverName = serverName;
            this.initialize();
        }

        protected Find(Class<I> pkClass, Class<T> modelClass) {
            super(null, modelClass);
            this.modelClass = modelClass;
            this.pkClass = pkClass;
            this.initialize();
        }


        public Query<T> query() {
            if (isSoftDelete) {
                return db().createQuery(modelClass).where().eq(softDeleteField, " != " + softDeleteCondition).query();
            } else {
                return db().find(this.modelClass);
            }
        }

        public void findEach(QueryEachConsumer<T> consumer) {
            this.query().findEach(consumer);
        }

        public void findEachWhile(QueryEachWhileConsumer<T> consumer) {
            this.query().findEachWhile(consumer);
        }

        public List<T> findList() {
            return this.query().findList();
        }

        public Set<T> findSet() {
            return this.query().findSet();
        }

        public Map<?, T> findMap() {
            return this.query().findMap();
        }

        public <K> Map<K, T> findMap(String keyProperty, Class<K> keyType) {
            return this.query().findMap(keyProperty, keyType);
        }

        public PagedList<T> findPagedList(int pageIndex, int pageSize) {
            return this.query().findPagedList(pageIndex, pageSize);
        }

        public FutureRowCount<T> findFutureRowCount() {
            return this.query().findFutureRowCount();
        }

        public int findRowCount() {
            return this.query().findRowCount();
        }

        public ExpressionFactory getExpressionFactory() {
            return this.query().getExpressionFactory();
        }

        public Query<T> select(String fetchProperties) {
            return this.query().select(fetchProperties);
        }

        public Query<T> fetch(String path) {
            return this.query().fetch(path);
        }

        public Query<T> fetch(String path, FetchConfig joinConfig) {
            return this.query().fetch(path, joinConfig);
        }

        public Query<T> fetch(String path, String fetchProperties) {
            return this.query().fetch(path, fetchProperties);
        }

        public Query<T> fetch(String assocProperty, String fetchProperties, FetchConfig fetchConfig) {
            return this.query().fetch(assocProperty, fetchProperties, fetchConfig);
        }

        public OrderBy<T> order() {
            return this.query().order();
        }

        public Query<T> order(String orderByClause) {
            return this.query().order(orderByClause);
        }

        public OrderBy<T> orderBy() {
            return this.query().orderBy();
        }

        public Query<T> orderBy(String orderByClause) {
            return this.query().orderBy(orderByClause);
        }

        public Query<T> setFirstRow(int firstRow) {
            return this.query().setFirstRow(firstRow);
        }

        public Query<T> setMaxRows(int maxRows) {
            return this.query().setMaxRows(maxRows);
        }

        public Query<T> setId(Object id) {
            return this.query().setId(id);
        }

        public Query<T> setQuery(String oql) {
            return this.db().createQuery(this.modelClass, oql);
        }

        public Query<T> setRawSql(RawSql rawSql) {
            return this.query().setRawSql(rawSql);
        }

        public Query<T> setAutofetch(boolean autofetch) {
            return this.query().setAutofetch(autofetch);
        }

        public Query<T> setForUpdate(boolean forUpdate) {
            return this.query().setForUpdate(forUpdate);
        }

        public Query<T> setReadOnly(boolean readOnly) {
            return this.query().setReadOnly(readOnly);
        }

        public Query<T> setLoadBeanCache(boolean loadBeanCache) {
            return this.query().setLoadBeanCache(loadBeanCache);
        }

        public Query<T> setUseCache(boolean useBeanCache) {
            return this.query().setUseCache(useBeanCache);
        }

        public Query<T> setUseQueryCache(boolean useQueryCache) {
            return this.query().setUseQueryCache(useQueryCache);
        }

        public ExpressionList<T> where() {
            if (isSoftDelete) {
                return db().createQuery(modelClass).where().eq(softDeleteField, " != " + softDeleteCondition);
            } else {
                return db().createQuery(modelClass).where();
            }
        }

        public T ref(I id) {
            return this.db().getReference(this.modelClass, id);
        }

        public Filter<T> filter() {
            return this.db().filter(this.modelClass);
        }

        public Query<T> apply(PathProperties pathProperties) {
            return this.query().apply(pathProperties);
        }

        public List<Object> findIds() {
            return this.query().findIds();
        }

        public List<T> all() {
            return this.query().findList();
        }

        public T byId(I id) {
            if (isSoftDelete) {
                return where().where().eq(pkField, id).where().raw(softDeleteField + " != " + softDeleteCondition).findUnique();
            } else {
                return db().find(this.modelClass, id);
            }
        }
    }


    public static class Finder<I, T> extends MyModel.Find<I, T> {
        public Finder(Class<I> pkId, Class<T> model) {
            super(pkId, model);
        }
    }
}