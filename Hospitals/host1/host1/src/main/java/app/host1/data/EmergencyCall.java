package app.host1.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EmergencyCall {
    @Id
    private int id;
    private String Drivername;
    private String PhoneNumber;
    private String ambulanceMatricule;
    private String date;
    private location location;

    public EmergencyCall() {

    }

    public EmergencyCall(int id, String drivername, String phoneNumber, String ambulanceMatricule, String date, location location) {
        this.id = id;
        Drivername = drivername;
        PhoneNumber = phoneNumber;
        this.ambulanceMatricule = ambulanceMatricule;
        this.date = date;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
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

    public app.host1.data.location getLocation() {
        return location;
    }

    public void setLocation(app.host1.data.location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "EmergencyCall{" +
                "Id=" + id +
                ", Drivername='" + Drivername + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", ambulanceMatricule='" + ambulanceMatricule + '\'' +
                ", date='" + date + '\'' +
                ", location=" + location +
                '}';
    }
}