package com.patient.service;

import com.patient.data.Patient;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientApi {

    @Autowired
    private ImplementationPatient implementationPatient;

    @GetMapping("/listOfPatient")
    public List<Patient> getListOfPatient(){
        return implementationPatient.getListOfPatient();
    }

    @PostMapping("/creatAccount")
    public Patient creatAccount(@RequestBody CreatPatient patient){
        return implementationPatient.CreatAccount(patient.getName(),patient.getPhone(),patient.getEmail(),patient.getAdresse());
    }

    @GetMapping("/getPatient")
    public Patient getPatient(@RequestHeader String name){
        return implementationPatient.findPatientByName(name);
    }
}

@Data
class CreatPatient{
        private String name;
        private String phone;
        private String email;
        private String adresse;
        public CreatPatient (){

        }

    public CreatPatient(String name, String phone, String email, String adresse) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.adresse = adresse;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
