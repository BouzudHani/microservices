package Ambulances1.Amb1.Services;

import Ambulances1.Amb1.Data.Ambulance;
import Ambulances1.Amb1.Repository.AmbulanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class AmbulanceImp  implements AmbulanceInterface{

    @Autowired
    private AmbulanceRepo ambulanceRepo;
    @Override
    public Ambulance save(Ambulance ambulance) {
        return ambulanceRepo.save(ambulance);
    }

    @Override
    public Ambulance getDisponibleAmbulance() {
        Ambulance result = null;
        Collection<Ambulance> collect = ambulanceRepo.findAll();
        for (Ambulance amb : collect
        ) { if(amb.isDispanible()==true) {
            result=amb;
            break;
        }
        }
        return result;
    }

    @Override
    public Ambulance setAmbulanceDisable(Ambulance ambulance) {
        ambulance.setDispanible(false);
        return ambulanceRepo.save(ambulance);
    }

    @Override
    public Ambulance setAmbulanceEnable(Ambulance ambulance) {
        ambulance.setDispanible(true);
        return ambulanceRepo.save(ambulance);
    }

}
