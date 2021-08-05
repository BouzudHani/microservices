package test_security.sec.web;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import test_security.sec.Entity.AppUser;
import test_security.sec.Service.AccountImplementation;

@RestController
public class UserSignup {

    @Autowired
    private AccountImplementation accountImplementation;

    @PostMapping("/signUp")
    public AppUser SignUp(@RequestBody UserForm userForm){
        return accountImplementation.saveUser(userForm.getUsername(),userForm.getPassword(),userForm.getConfirmedPassword());
    }
}

@Data
class UserForm{
    private String username;
    private String password;
    private String confirmedPassword;

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
