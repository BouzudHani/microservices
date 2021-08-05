package emergency.call.Urgence.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Document
public class EmergencyCall {
    @Id
    private int id;
    private String driverName;
    private String driverPhoneNumber;
    private String ambulanceMatricule;
    private String Date ;

    public EmergencyCall(){

    }
    public EmergencyCall(int id, String driverName, String driverPhoneNumber, String ambulanceMatricule) {
        this.id = id;
        this.driverName = driverName;
        this.driverPhoneNumber = driverPhoneNumber;
        this.ambulanceMatricule = ambulanceMatricule;
        DateFormat ShortDate = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, new Locale("EN","en"));
        Date Now = new Date();
        this.Date = ShortDate.format(Now);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }

    public void setDriverPhoneNumber(String driverPhoneNumber) {
        this.driverPhoneNumber = driverPhoneNumber;
    }

    public String getAmbulanceMatricule() {
        return ambulanceMatricule;
    }

    public void setAmbulanceMatricule(String ambulanceMatricule) {
        this.ambulanceMatricule = ambulanceMatricule;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "EmergencyCall{" +
                "id=" + id +
                ", driverName='" + driverName + '\'' +
                ", driverPhoneNumber='" + driverPhoneNumber + '\'' +
                ", ambulanceMatricule='" + ambulanceMatricule + '\'' +
                ", Date : "+ Date +
                " }";
    }
}
