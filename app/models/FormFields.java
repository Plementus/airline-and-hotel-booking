package models;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.OneToMany;
import javax.persistence.Transient;


/**
 * Created by Ibrahim Olanrewaju on 3/15/2016.
 */
@Entity
@SoftDelete
public class FormFields extends MyModel {
    public String name; //used
    @Enumerated
    public FormFieldTypes field_type; //used
    public String label; //used
    public String default_value;  //used
    @Transient
    public Map<String,String> select_options; //used
    public String description;
    @OneToMany(mappedBy = "form_field_id")
    public List<FormFieldAttrValidations> attrValidationsList; //used

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FormFieldTypes getField_type() {
        return field_type;
    }

    public void setField_type(FormFieldTypes field_type) {
        this.field_type = field_type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDefault_value() {
        return default_value;
    }

    public void setDefault_value(String default_value) {
        this.default_value = default_value;
    }

    public Map<String, String> getSelect_options() {
        if(select_options == null) {
            select_options = new HashMap<>();
        }
        return select_options;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<FormFieldAttrValidations> getAttrValidationsList() {
        if(attrValidationsList == null) {
            attrValidationsList = new ArrayList<>();
        }
        return attrValidationsList;
    }
}
