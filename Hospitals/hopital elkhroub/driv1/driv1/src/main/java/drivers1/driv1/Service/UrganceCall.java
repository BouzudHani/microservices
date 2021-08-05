package drivers1.driv1.Service;

import drivers1.driv1.Document.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrganceCall {
    @Autowired
    private DriverImp driverImplementation;

    @GetMapping("/getDriver")
    public Driver getDriver(){
        Driver avDriver = driverImplementation.findAvailableDriver();
        return driverImplementation.setDriverNotAvailable(avDriver);
    }
}
