package EmergencyController.Emergency_Controller.Service;

import EmergencyController.Emergency_Controller.Doc.Call;
import EmergencyController.Emergency_Controller.Doc.EmergencyCall;
import EmergencyController.Emergency_Controller.Doc.Hospital;
import EmergencyController.Emergency_Controller.Doc.Location;

import java.util.List;

public interface EmergencyInterface {
    public Hospital saveHospital(Hospital hospital);
    public EmergencyCall save(EmergencyCall emergencyCall);
    public List<Hospital> getClosestHospital(Location userLocation);
    public Hospital getHosp(String hostname);
}
