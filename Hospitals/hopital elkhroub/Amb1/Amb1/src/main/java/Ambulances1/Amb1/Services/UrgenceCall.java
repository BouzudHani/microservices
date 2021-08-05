package Ambulances1.Amb1.Services;

import Ambulances1.Amb1.Data.Ambulance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrgenceCall {

    @Autowired
    private AmbulanceImp ambulanceImp;

    @GetMapping("/getAmbulance")
    public Ambulance getAmbulance(){
        Ambulance callAmbulance= ambulanceImp.getDisponibleAmbulance();
        return ambulanceImp.setAmbulanceDisable(callAmbulance);
    }
}
