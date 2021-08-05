package drivers2.driv2.Serviec;

import drivers2.driv2.Document.Driver;

public interface DriverInterface {
    public Driver Save(Driver driver);
    public Driver findAvailableDriver();
    public Driver setDriverAvailable(Driver driver);
    public Driver setDriverNotAvailable(Driver driver);
    public Driver findDriverByPhoneNumber(String phone);
}
