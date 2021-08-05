package Ambulances1.Amb1.Services;

import Ambulances1.Amb1.Data.Ambulance;

public interface AmbulanceInterface {
    public Ambulance save(Ambulance ambulance);
    public Ambulance getDisponibleAmbulance();
    public Ambulance setAmbulanceDisable(Ambulance ambulance);
    public  Ambulance  setAmbulanceEnable(Ambulance ambulance);
}
