package test_security.sec.Service;

import test_security.sec.Entity.AppRole;
import test_security.sec.Entity.AppUser;

public interface Accounte {
    public AppUser saveUser(String name, String password, String confirmpasswor);
    public AppRole save(AppRole role);
    public AppUser loadUserByUserName (String username);
    public void addRoleToUser(String username,String rolename);
    public void delete(String UserName);

}
