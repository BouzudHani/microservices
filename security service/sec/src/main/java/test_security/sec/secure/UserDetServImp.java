package test_security.sec.secure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import test_security.sec.Entity.AppUser;
import test_security.sec.Service.AccountImplementation;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserDetServImp implements UserDetailsService {
    @Autowired
    private AccountImplementation accountImplementation;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        AppUser User = accountImplementation.loadUserByUserName(s);
        if (User == null) throw new UsernameNotFoundException("invalid user");
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        User.getRoles().forEach(r -> {
            authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
        });

        return new User(User.getUserName(),User.getPassword(),authorities);
    }
}
