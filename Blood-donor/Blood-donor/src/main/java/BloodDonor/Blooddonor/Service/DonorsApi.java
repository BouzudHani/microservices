package BloodDonor.Blooddonor.Service;

import BloodDonor.Blooddonor.Document.Donor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DonorsApi {
    @Autowired
    private BloodImplementation bloodImplementation;
    @PostMapping("/CreatAccout")
    public Donor Creat(@RequestBody CreatDonor donor){
        return bloodImplementation.CreatAccount(donor.getName(),donor.getPhone(),donor.getEmail(),donor.getBloodtype(),donor.getAddress());
    }
    @GetMapping("/donorsList")
    public List<Donor> getdonorst(){
        return bloodImplementation.Donors();
    }
    @GetMapping("/getDonorByName")
    public  Donor getDon(@RequestHeader String userName){
        return bloodImplementation.getDonorByName(userName);
    }
    @PostMapping("/getDonorByName")
    public Donor getDonor(@RequestBody String UserName){ return bloodImplementation.getDonorByName(UserName); }


}
@Data
class CreatDonor{
    private String name;
    private String phone;
    private  String email;
    private String bloodtype;
    private  String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
