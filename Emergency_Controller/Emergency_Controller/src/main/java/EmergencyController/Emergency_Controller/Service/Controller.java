package EmergencyController.Emergency_Controller.Service;

import EmergencyController.Emergency_Controller.Doc.Call;
import EmergencyController.Emergency_Controller.Doc.EmergencyCall;
import EmergencyController.Emergency_Controller.Doc.Hospital;
import EmergencyController.Emergency_Controller.Doc.Location;
import EmergencyController.Emergency_Controller.Repo.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EmergencyConttrollerImp emergencyConttrollerImp;

    private RestTemplate restTemplate= new RestTemplate();
    @Autowired
    private HospitalRepo hospitalRepo;

    @PostMapping("/urgenceCall")
    public EmergencyCall SystemController(@RequestBody Location location ){
        List<Hospital> ClosestHospitals = emergencyConttrollerImp.getClosestHospital(location);

        EmergencyCall resultat =null;
        for (Hospital host : ClosestHospitals ) {
            String url = "http://localhost:"+host.getPort()+"/emergencyCall";
           // Call call = restTemplate.getForObject(url,Call.class);
            try{
                Call call1 = restTemplate.postForObject(url,location,Call.class);
                System.out.println("resultat : ========>"+call1);
                if (call1 != null){
                    resultat = new EmergencyCall(id(),call1.getDrivername(),call1.getPhoneNumber(),call1.getAmbulanceMatricule(),call1.getDate(),host.getHospitalName(),location);
                    break;
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return resultat;
    }
    @GetMapping("/getProfile")
    public Hospital getHostbyId(@RequestHeader String host){
        return emergencyConttrollerImp.getHosp(host);
    }

    private int id(){
        Collection<Hospital> h = hospitalRepo.findAll();
        int id = h.size()+1;
        return id;
    }
}
