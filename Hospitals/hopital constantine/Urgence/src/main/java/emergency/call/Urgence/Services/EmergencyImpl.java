package emergency.call.Urgence.Services;

import emergency.call.Urgence.Document.Ambulance;
import emergency.call.Urgence.Document.Driver;
import emergency.call.Urgence.Document.EmergencyCall;
import emergency.call.Urgence.Repository.CallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class EmergencyImpl implements EmergancyInterface {
    @Autowired
    private CallRepo callRepo;

    @Override
    public EmergencyCall save(Driver driver, Ambulance ambulance) {
        int id = callRepo.findAll().size()+1;
        EmergencyCall emergencyCall = new EmergencyCall(id,driver.getName(),driver.getPhoneNumber(),ambulance.getMatricule());
        EmergencyCall call = callRepo.save(emergencyCall);
        return call;
    }
}
