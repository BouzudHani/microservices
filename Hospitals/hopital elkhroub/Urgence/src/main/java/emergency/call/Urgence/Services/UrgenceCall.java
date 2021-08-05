package emergency.call.Urgence.Services;

import emergency.call.Urgence.Document.Ambulance;
import emergency.call.Urgence.Document.Driver;
import emergency.call.Urgence.Document.EmergencyCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UrgenceCall {
    @Autowired
    private EmergencyImpl emergency;
    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/appelUrgence")
    public EmergencyCall getEmergencyCall(){
        Ambulance ambulance = restTemplate.getForObject("http://hani:8071/getAmbulance",Ambulance.class);
        Driver driver1= restTemplate.getForObject("http://hani:8074/getDriver",Driver.class);
        if(ambulance==null) return null ;
        else {
                if (driver1 == null) return null;
                else {
                    return emergency.save(driver1,ambulance);
                }
            }
    }
}
