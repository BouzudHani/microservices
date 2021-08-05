package host2.services;


import host2.data.*;
import host2.repo.AmbulanceRep;
import host2.repo.BloodTypeRepo;
import host2.repo.DriverRepo;
import host2.repo.EmergencyCallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ManagerImpl implements  managerInterface {


    @Autowired
    private AmbulanceRep ambulanceRep;
    @Autowired
    private DriverRepo driverRepo;
    @Autowired
    private BloodTypeRepo bloodTypeRepo;
    @Autowired
    private EmergencyCallRepo emergencyCallRepo;

    @Override
    public Driver saveDriver(String name, String phone, boolean available) {
        int id = driverRepo.findAll().size() + 1;
        return driverRepo.save(new Driver(id, name, phone, available));
    }

    @Override
    public Ambulance saveAmbulance(String Matrucule, boolean disponible) {
        int id = ambulanceRep.findAll().size() + 1;
        return ambulanceRep.save(new Ambulance(id, Matrucule, disponible));
    }

    @Override
    public BloodType AddbloodType(BloodType b) {
        return bloodTypeRepo.save(b);
    }

    private String getDate() {
        String pattern = "MM/dd/yyyy HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);
        Date today = Calendar.getInstance().getTime();
        return df.format(today);

    }

    @Override
    public EmergencyCall saveCall(location location) {
        EmergencyCall result = null;
        Driver driver = getDisponibleDriver();
        Ambulance ambulance = getDisponibleAmbulance();
        if (driver.equals(null) || ambulance.equals(null)) {
            return result;
        } else {
            int id = emergencyCallRepo.findAll().size() + 1;
            result = emergencyCallRepo.save(new EmergencyCall(id, driver.getName(), driver.getPhoneNumber(), ambulance.getMatricule(), getDate(), location));
            return result;
        }
    }

    @Override
    public List<EmergencyCall> getCalls() {
        return emergencyCallRepo.findAll();
    }

    @Override
    public Driver getDisponibleDriver() {
        List<Driver> drivers = driverRepo.findAll();
        Driver result = null;
        for (Driver d : drivers) {
            if (d.getAvailable()) {
                setDriverNotAvailabel(d);
                result = d;
                break;
            }
        }
        return result;
    }

    @Override
    public Ambulance getDisponibleAmbulance() {
        List<Ambulance> ambulances = ambulanceRep.findAll();
        Ambulance result = null;
        for (Ambulance d : ambulances) {
            if (d.isDispanible()) {
                setAmbulanceNotAvailabel(d);
                result = d;
                break;
            }
        }
        return result;
    }
    @Override
    public BloodType UpdateBloodType(int percentage ,String bloodtype) {
        BloodType b = findBloodType(bloodtype);
        b.setPercentage(percentage);
        return bloodTypeRepo.save(b);
    }

    private BloodType findBloodType(String bloodtype){
        List<BloodType> lists = bloodTypeRepo.findAll();
        BloodType result = null;
        for (BloodType b: lists) {
            if (b.getBloodType().equals(bloodtype)){
                result = b;
                break;
            }
        }
        return result;
    }
    @Override
    public Driver setDriverAvailabel(String name , boolean available) {
        Driver d  = findDriverByname(name);
        d.setAvailable(available);
        return driverRepo.save(d);
    }


    private Driver setDriverNotAvailabel(Driver d) {
        d.setAvailable(false);
        return driverRepo.save(d);
    }

    @Override
    public Ambulance setAmbulanceAvailabel(String matricule , boolean available) {
        Ambulance a = findAmbulanceByMat(matricule);
        a.setDispanible(available);
        return ambulanceRep.save(a);
    }

    private Ambulance setAmbulanceNotAvailabel(Ambulance a) {
        a.setDispanible(false);
        return ambulanceRep.save(a);
    }

    @Override
    public Driver findDriverByname(String name) {
        List<Driver> drivers = driverRepo.findAll();
        Driver resultat = null;
        for (Driver d : drivers) {
            if (d.getName().equals(name)) {
                resultat = d;
                break;
            }
        }
        return resultat;
    }

    @Override
    public Ambulance findAmbulanceByMat(String matricule) {
        List<Ambulance> drivers = ambulanceRep.findAll();
        Ambulance resultat = null;
        for (Ambulance d : drivers) {
            if (d.getMatricule().equals(matricule)) {
                resultat = d;
                break;
            }
        }
        return resultat;

    }
    @Override
    public Driver EditphoneNumber(String name, String phone) {
        Driver res = findDriverByname(name);
        res.setPhoneNumber(phone);
        return driverRepo.save(res);
    }
    @Override
    public void deletAmbulance(String matricule) {
        Ambulance a = findAmbulanceByMat(matricule);
        ambulanceRep.delete(a);
    }

    @Override
    public void deletDriver(String name) {
        Driver a = findDriverByname(name);
        driverRepo.delete(a);
    }
}
