package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by Ibrahim Olanrewaju on 3/15/2016.
 */
@SoftDelete
@Entity
public class FormFieldAttrValidations extends MyModel {
    @Column(name = "`key`")
    public String key;
    @Column(name = "`value`")
    public String value;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "form_field_id")
    public FormFields form_field_id;
    public boolean is_attr;
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public static final MyModel.Finder<Long, FormFieldAttrValidations> find = new MyModel.Finder<>(Long.class, FormFieldAttrValidations.class);

}
