package drivers1.driv1.Service;

import drivers1.driv1.Document.Driver;
import drivers1.driv1.Repo.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

@Service
@Transactional
public class DriverImp implements DriverInterface {
    @Autowired
    private DriverRepo driverRepo;

    @Override
    public Driver Save(Driver driver) {
        return driverRepo.save(driver);
    }

    @Override
    public Driver findAvailableDriver() {
        Collection<Driver> listofDriver= new ArrayList<>();
        listofDriver= driverRepo.findAll();
        Driver result = null;
        for (Driver dr : listofDriver ) {
            if (dr.getAvailable()==true){
                result = dr;
                break;
            }
        }
        return result;
    }

    @Override
    public Driver setDriverAvailable(Driver driver) {
        driver.setAvailable(true);
        return driverRepo.save(driver);
    }

    @Override
    public Driver setDriverNotAvailable(Driver driver) {
        driver.setAvailable(false);
        return driverRepo.save(driver);
    }

    @Override
    public Driver findDriverByPhoneNumber(String phone) {
        Collection <Driver> listDrivers= driverRepo.findAll();
        Driver result= null;
        for (Driver dr : listDrivers ) {
            if (dr.getPhoneNumber().equals(phone)){
                result=dr;
                break;
            }
        }
        return result;
    }
}
