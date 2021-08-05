package EmergencyController.Emergency_Controller.Service;

import EmergencyController.Emergency_Controller.Doc.EmergencyCall;
import EmergencyController.Emergency_Controller.Doc.Hospital;
import EmergencyController.Emergency_Controller.Doc.HospitalSArray;
import EmergencyController.Emergency_Controller.Doc.Location;
import EmergencyController.Emergency_Controller.Repo.EmergencyCallRepo;
import EmergencyController.Emergency_Controller.Repo.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class EmergencyConttrollerImp implements EmergencyInterface {

    @Autowired
    private HospitalRepo hospitalRepo;
    @Autowired
    private EmergencyCallRepo emergencyCallRepo;

    public final static double AVERAGE_RADIUS_OF_EARTH_KM = 6371;


    @Override
    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepo.save(hospital);
    }

    @Override
    public EmergencyCall save(EmergencyCall emergencyCall) {
        return emergencyCallRepo.save(emergencyCall);
    }

    @Override
    public List<Hospital> getClosestHospital(Location userLocation) {
        List<Hospital> Hospitalls =  hospitalRepo.findAll();
        List<HospitalSArray>  arrayDis = new ArrayList<>();
        for (Hospital hot : Hospitalls) {
            double distance = calculateDistanceInKilometer(userLocation.getLatitude(),userLocation.getLongitude(),hot.getLocation().getLatitude(),hot.getLocation().getLongitude());
            arrayDis.add(new HospitalSArray(hot,distance));
        }
       return trier(arrayDis);
    }

    @Override
    public Hospital getHosp(String hostname) {
        List<Hospital> hospitals = hospitalRepo.findAll();
        Hospital resultat = null;
        for (Hospital h: hospitals) {
            if(h.getHostId().equals(hostname)){
                resultat=h;
                break;
            }
        }
        return resultat;
    }

    private  List<Hospital> trier(List<HospitalSArray> hotsTrier){
        List<Hospital> hospitals = new ArrayList<>();
        HospitalSArray tab [] = new HospitalSArray[hotsTrier.size()];
        for (int i =0 ;i<hotsTrier.size();i++){
            tab[i]= hotsTrier.get(i);
        }
        HospitalSArray e ;
        for (int i=0 ;i<tab.length;i++) {
            for(int j=i+1;j<tab.length;j++) {
                if ( tab[j].getDistance() < tab[i].getDistance() ) {
                    e=tab[i];
                    tab[i]=tab[j];
                    tab[j]=e;
                }
            }
        }
        for (int i =0 ;i<tab.length;i++){
            hospitals.add(tab[i].getHospital());
        }
        return hospitals;

    }

    private double calculateDistanceInKilometer(double userLat, double userLng,
                                                double venueLat, double venueLng) {

        double latDistance = Math.toRadians(userLat - venueLat);
        double lngDistance = Math.toRadians(userLng - venueLng);

        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(userLat)) * Math.cos(Math.toRadians(venueLat))
                * Math.sin(lngDistance / 2) * Math.sin(lngDistance / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return  (Math.round(AVERAGE_RADIUS_OF_EARTH_KM * c));
    }

}
