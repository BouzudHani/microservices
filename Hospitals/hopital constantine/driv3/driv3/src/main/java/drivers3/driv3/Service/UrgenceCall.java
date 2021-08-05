package drivers3.driv3.Service;

import drivers3.driv3.Doc.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrgenceCall {
    @Autowired
    private DriverImp driverImplementation;

    @GetMapping("/getDriver")
    public Driver getDriver(){
        Driver avDriver = driverImplementation.findAvailableDriver();
        return driverImplementation.setDriverNotAvailable(avDriver);
    }
}
