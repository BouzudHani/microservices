package drivers1.driv1.Service;

import drivers1.driv1.Document.Driver;

public interface DriverInterface {
    public Driver Save(Driver driver);
    public Driver findAvailableDriver();
    public Driver setDriverAvailable(Driver driver);
    public Driver setDriverNotAvailable(Driver driver);
    public Driver findDriverByPhoneNumber(String phone);
}
