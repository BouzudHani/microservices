package drivers3.driv3.Service;

import drivers3.driv3.Doc.Driver;

public interface DriverInterface {
    public Driver Save(Driver driver);
    public Driver findAvailableDriver();
    public Driver setDriverAvailable(Driver driver);
    public Driver setDriverNotAvailable(Driver driver);
    public Driver findDriverByPhoneNumber(String phone);
}
