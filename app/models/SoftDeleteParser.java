package models;

import play.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 21/02/2016 9:58 AM
 * |
 **/
public class SoftDeleteParser {

    public void parse(Class<?> clazz) {
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            SoftDelete softDelete = field.getAnnotation(SoftDelete.class);
            String ormField = softDelete.field();
            if (field.isAnnotationPresent(SoftDelete.class)) {
                Logger.info("Field: " + field.getName());
            }
        }
    }
}