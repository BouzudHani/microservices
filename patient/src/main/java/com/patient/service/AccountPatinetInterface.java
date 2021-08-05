package com.patient.service;


import com.patient.data.Patient;

import java.util.List;

public interface AccountPatinetInterface {
    public Patient savePatient(Patient patient);
    public Patient findPatientByName(String name);
    public void deletePatient(String name);
    public List<Patient> getListOfPatient();
    public Patient CreatAccount(String name , String phone , String email , String adress );
}
