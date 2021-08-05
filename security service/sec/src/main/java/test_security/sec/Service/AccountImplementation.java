package test_security.sec.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test_security.sec.Entity.AppRole;
import test_security.sec.Entity.AppUser;
import test_security.sec.Repo.AppRoleRepo;
import test_security.sec.Repo.AppUserRepo;

@Service
@Transactional
public class AccountImplementation<AppUserRepsitory> implements Accounte {

    @Autowired
    private AppRoleRepo appRoleRepo;
    @Autowired
    private AppUserRepo appUserRepo;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public AppUser saveUser(String name, String password, String confirmedPassword) {
        AppUser user = appUserRepo.findUserByUserName(name);
        if (user != null) throw new RuntimeException("user already existed ");
        if (!password.equals(confirmedPassword)) throw new RuntimeException("please conformed your password");
        AppUser appUser = new AppUser();
        appUser.setUserName(name);
        appUser.setActivated(true);
        appUser.setPassword(bCryptPasswordEncoder.encode(password));
        appUserRepo.save(appUser);
        addRoleToUser(appUser.getUserName(), "USER");
        return appUser;
    }

    @Override
    public void delete(String UserName){
        AppUser del = appUserRepo.findUserByUserName(UserName);
        appUserRepo.delete(del);
    }

    @Override
    public AppRole save(AppRole role) {
        return appRoleRepo.save(role);
    }

    @Override
    public AppUser loadUserByUserName(String username) {
        return appUserRepo.findUserByUserName(username);
    }

    @Override
    public void addRoleToUser(String username, String rolename) {
        AppUser user = appUserRepo.findUserByUserName(username);
        AppRole role = appRoleRepo.findRoleByRoleName(rolename);

        user.getRoles().add(role);
    }
}
