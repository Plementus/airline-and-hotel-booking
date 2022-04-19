package models;

import javax.persistence.*;
import java.util.List;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 14/03/2016 2:25 PM
 * |
 **/
@SoftDelete
@Entity
public class AppFormField extends MyModel {
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "form_field_id")
    public FormFields form_field_id;
    public boolean is_required;
    @Enumerated
    public AppFeatureLibraries feature_name;
    @Transient
    public boolean is_array_field;
    @Transient
    public String tmp_value;

    public boolean is_array_field() {
        return is_array_field;
    }

    public void setIs_array_field(boolean is_array_field) {
        this.is_array_field = is_array_field;
    }

    public boolean is_required() {
        return is_required;
    }

    public void setIs_required(boolean is_required) {
        this.is_required = is_required;
    }

    public static final MyModel.Finder<Long, AppFormField> find = new MyModel.Finder<>(Long.class, AppFormField.class);

    public static AppFormField getField(String fieldName) {
        return find.where().eq("form_field_id.name", fieldName).findUnique();
    }

    public static List<AppFormField> getFeatureFormFields(AppFeatureLibraries featureName) {
        return find.where().eq("feature_name", featureName).findList();
    }

}