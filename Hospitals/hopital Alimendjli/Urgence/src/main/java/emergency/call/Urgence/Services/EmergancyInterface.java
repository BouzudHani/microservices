package emergency.call.Urgence.Services;

import emergency.call.Urgence.Document.Ambulance;
import emergency.call.Urgence.Document.Driver;
import emergency.call.Urgence.Document.EmergencyCall;

public interface EmergancyInterface {
    public EmergencyCall save(Driver driver , Ambulance ambulance);

}
