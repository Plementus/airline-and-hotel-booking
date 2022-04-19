package core.security.auth.storage;

import models.Users;

import java.io.Serializable;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 23/12/2015 3:47 PM
 * |
 **/

/**
 * @author Igbalajobi Jamiu Okunade
 * @version 1.0
 * @see java.io.Serializable
 * @see StorageInterface
 */
public class Session implements StorageInterface, Serializable {

    private Long userId;

    private String roleCode;

    private int roleLevel;

    private String email;

    private String firstName;

    private String lastName;

    private Users users;

    @Override
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public Long getUserId() {
        return this.userId;
    }

    @Override
    public void setRole(String roleCode) {
        this.roleCode = roleCode;
    }

    @Override
    public String getRole() {
        return this.roleCode;
    }

    @Override
    public void setRoleLevel(int level) {
        this.roleLevel = level;
    }

    @Override
    public int getRoleLevel() {
        return this.roleLevel;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setUser(Users user) {
        this.users = user;
    }

    @Override
    public Users getUser() {
        return this.users;
    }
}