package Ambulances2.Amb2.Service;

import Ambulances2.Amb2.Data.Ambulance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrganceCall {

    @Autowired
    private AmbulanceImp ambulanceImp;

    @GetMapping("/getAmbulance")
    public Ambulance getAmbulance(){
        Ambulance callAmbulance= ambulanceImp.getDisponibleAmbulance();
        return ambulanceImp.setAmbulanceDisable(callAmbulance);
    }
}
