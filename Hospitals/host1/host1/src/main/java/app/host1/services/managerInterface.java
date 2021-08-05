package app.host1.services;

import app.host1.data.*;

import java.util.List;

public interface managerInterface {
    public Driver saveDriver(String name ,String phone , boolean available);
    public Ambulance saveAmbulance(String Matrucule,boolean disponible);
    public BloodType UpdateBloodType (int percentage,String bloodtype);
    public EmergencyCall saveCall (location location);
    public List<EmergencyCall> getCalls();
    public Driver getDisponibleDriver();
    public Ambulance getDisponibleAmbulance();
    public Driver setDriverAvailabel(String name , boolean availble);
    public Ambulance setAmbulanceAvailabel(String matricule , boolean availble);
    public Driver findDriverByname(String name);
    public Ambulance findAmbulanceByMat(String matricule);
    public Driver EditphoneNumber(String name , String phone);
    public void deletAmbulance(String matricule);
    public void deletDriver(String name);

}
