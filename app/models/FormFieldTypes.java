package models;

import com.avaje.ebean.annotation.EnumValue;

import javax.persistence.Enumerated;

/**
 * Created by Ibrahim Olanrewaju on 3/15/2016.
 */
public enum FormFieldTypes  {
    @EnumValue("text")
    text("input text"),
    @EnumValue("textarea")
    textarea("textarea"),
    @EnumValue("number")
    number("input number"),
    @EnumValue("email")
    email("input email"),
    @EnumValue("select")
    select("select"),
    @EnumValue("radio")
    radio ("input radio"),
    @EnumValue("checkbox")
    checkbox("input checkbox"),
    @EnumValue("submit")
    submit("input submit"),
    @EnumValue("reset")
    reset("input reset"),
    @EnumValue("color")
    color("input color"),
    @EnumValue("date")
    date("input date"),
    @EnumValue("datetime")
    datetime("input datetime"),
    @EnumValue("file")
    file("input file"),
    @EnumValue("hidden")
    hidden("input hidden"),
    @EnumValue("password")
    password("input password"),
    @EnumValue("url")
    url("input url"),
    @EnumValue("phone")
    phone ("input phone");

    private String value;

    private FormFieldTypes(String v) {
        value = v;
    }

    public String getValue() {
        return value;
    }
}
