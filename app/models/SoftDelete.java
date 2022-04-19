package models;

import com.avaje.ebean.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 10/18/15 11:40 PM
 * |
 **/

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface SoftDelete {
    String field() default "deleted";
}
