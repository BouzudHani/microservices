package EmergencyController.Emergency_Controller.Doc;

public class Call {
    private String Drivername;
    private String PhoneNumber;
    private String ambulanceMatricule;
    private String date;
    private Location location;

    public Call(){
    }

    public Call( String drivername, String phoneNumber, String ambulanceMatricule, String date, Location location) {
        Drivername = drivername;
        PhoneNumber = phoneNumber;
        this.ambulanceMatricule = ambulanceMatricule;
        this.date = date;
        this.location = location;
    }

    public String getDrivername() {
        return Drivername;
    }

    public void setDrivername(String drivername) {
        Drivername = drivername;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAmbulanceMatricule() {
        return ambulanceMatricule;
    }

    public void setAmbulanceMatricule(String ambulanceMatricule) {
        this.ambulanceMatricule = ambulanceMatricule;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Call{" +
                "Drivername='" + Drivername + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", ambulanceMatricule='" + ambulanceMatricule + '\'' +
                ", date='" + date + '\'' +
                ", location=" + location +
                '}';
    }
}
