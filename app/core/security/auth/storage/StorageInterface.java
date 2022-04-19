package core.security.auth.storage;

import models.Users;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 23/12/2015 3:44 PM
 * |
 **/
public interface StorageInterface {

    public void setUserId(Long userId);

    public Long getUserId();

    public void setRole(String roleCode);

    public String getRole();

    public void setRoleLevel(int level);

    public int getRoleLevel();

    public void setEmail(String email);

    public String getEmail();

    public void setFirstName(String firstName);

    public String getFirstName();

    public void setLastName(String lastName);

    public String getLastName();

    public void setUser(Users user);

    public Users getUser();

}
