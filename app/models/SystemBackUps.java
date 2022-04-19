package models;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

/**
 * |
 * | Created by Igbalajobi Jamiu O.
 * | On 13/03/2016 9:35 AM
 * |
 **/
@Entity
@SoftDelete
public class SystemBackUps extends MyModel {
    @Enumerated
    public SystemBackUpTypes backup_type;
    public String name;
    public Double size;
    public String extension;
    public String file_url;
}