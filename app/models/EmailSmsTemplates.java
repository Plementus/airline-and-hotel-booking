package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/03/2016 11:49 PM
 * |
 **/
@Entity
@SoftDelete
public class EmailSmsTemplates extends MyModel {
    public String name;
    @Column(columnDefinition = "LONGTEXT DEFAULT NULL")
    public String email_template;
    public String subject;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "auth_user_id")
    public Users auth_user_id;
}