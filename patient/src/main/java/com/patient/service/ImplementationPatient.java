package com.patient.service;

import com.patient.data.Patient;
import com.patient.repo.PatinetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplementationPatient implements AccountPatinetInterface{
    @Autowired
    private PatinetRepo patinetRepo;

    @Override
    public Patient savePatient(Patient patient) {
        return patinetRepo.save(patient);
    }

    @Override
    public Patient findPatientByName(String name) {
        Patient p = null;
        List<Patient> lp = patinetRepo.findAll();
        for (Patient px : lp) {
            if(px.getName().equals(name)){
                p = px;
                break;
            }
        }
        System.out.println(p);
        return p;
    }

    @Override
    public void deletePatient(String name) {
        patinetRepo.delete(findPatientByName(name));
    }

    @Override
    public List<Patient> getListOfPatient() {
        return patinetRepo.findAll();
    }

    @Override
    public Patient CreatAccount(String name, String phone, String email, String adress) {
        int id = patinetRepo.findAll().size()+1;
        Patient patient = new Patient(id,name,phone,email,adress);
        return savePatient(patient);
    }

}
