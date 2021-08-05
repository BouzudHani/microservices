package Ambulances2.Amb2.Service;


import Ambulances2.Amb2.Data.Ambulance;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface AmbulanceInterface {
    public Ambulance save(Ambulance ambulance);
    public Ambulance getDisponibleAmbulance();
    public Ambulance setAmbulanceDisable(Ambulance ambulance);
    public  Ambulance  setAmbulanceEnable(Ambulance ambulance);
}
