package host3.services;

import host3.data.*;
import host3.repo.AmbulanceRep;
import host3.repo.BloodTypeRepo;
import host3.repo.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class service {

    @Autowired
    private ManagerImpl manager;
    @Autowired
    private DriverRepo driverRepo;
    @Autowired
    private AmbulanceRep ambulanceRep;
    @Autowired
    private BloodTypeRepo bloodTypeRepo;

    @PostMapping("/setBloodPercent")
    public BloodType setPercent(@RequestBody Blood blood){
        return manager.UpdateBloodType(blood.getPercent(),blood.getType());
    }
    @PostMapping("/setAvailbeldriver")
    public Driver setNotavailble(@RequestBody Dri dri){
        return manager.setDriverAvailabel(dri.getName(),dri.isAvailable());
    }
    @PostMapping("/setAvailbelAmbulance")
    public Ambulance setNotavailbleambulance(@RequestBody Amb amb){
        return manager.setAmbulanceAvailabel(amb.getMatricule(),amb.isAvailable());
    }
    @PostMapping("/emergencyCall")
    public EmergencyCall getAnEmergencyCall(@RequestBody location location){
        return manager.saveCall(location);
    }
    @GetMapping("/getDrivers")
    public List<Driver> getDrivers(){
        return driverRepo.findAll();
    }
    @GetMapping("/getBloods")
    public List<BloodType> getBloods(){ return bloodTypeRepo.findAll(); }
    @GetMapping("/getAmbulances")
    public List<Ambulance> getAmbulances(){
        return ambulanceRep.findAll();
    }
    @GetMapping("/getCalls")
    public List<EmergencyCall> getCalls(){
        return manager.getCalls();
    }
    @PostMapping("addDriver")
    public Driver addDriver(@RequestBody DriverK d){
        return manager.saveDriver(d.getName(),d.getPhone(),true);
    }
    @PostMapping("EditPhone")
    public Driver EditPhone(@RequestBody DriverK d){
        return manager.EditphoneNumber(d.getName(),d.getPhone());
    }
    @PostMapping("addAmbulance")
    public Ambulance addAmbuance(@RequestBody Amb amb){
        return manager.saveAmbulance(amb.getMatricule(),amb.isAvailable());
    }
    @DeleteMapping("deletDriver")
    public void deletDriver(@RequestHeader String name){
        manager.deletDriver(name);
    }
    @DeleteMapping("deletAmbulance")
    public void deletAmbulance(@RequestHeader String matricle){
        manager.deletAmbulance(matricle);
    }
}
class DriverK{
    private String name;
    private String phone;

    public DriverK(){

    }
    public DriverK(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

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
}
class Amb{
    private String matricule;
    private boolean available;

    public Amb(String matricule, boolean available) {
        this.matricule = matricule;
        this.available = available;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
class Dri{
    private String name;
    private boolean available;

    public Dri(String name, boolean available) {
        this.name = name;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
class Blood{
    private String Type;
    private int percent;

    public Blood(String type, int percent) {
        Type = type;
        this.percent = percent;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}