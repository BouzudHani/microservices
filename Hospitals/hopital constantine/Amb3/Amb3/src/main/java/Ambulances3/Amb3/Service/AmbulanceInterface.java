package Ambulances3.Amb3.Service;

import Ambulances3.Amb3.Data.Ambulance;

public interface AmbulanceInterface {
    public Ambulance save(Ambulance ambulance);
    public Ambulance getDisponibleAmbulance();
    public Ambulance setAmbulanceDisable(Ambulance ambulance);
    public  Ambulance  setAmbulanceEnable(Ambulance ambulance);
}
