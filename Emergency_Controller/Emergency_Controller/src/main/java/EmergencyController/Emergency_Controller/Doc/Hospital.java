package EmergencyController.Emergency_Controller.Doc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hospital {
    @Id
    private int id;
    private String HospitalName;
    private String phone;
    private String email;
    private String hostId;
    private String Adresse;
    private int Port;
    private Location  location;

    public Hospital(){
    }

    public Hospital(int id, String hospitalName, String phone, String email, String hostId, String adresse, int port, Location location) {
        this.id = id;
        this.HospitalName = hospitalName;
        this.phone = phone;
        this.email = email;
        this.hostId = hostId;
        this.Adresse = adresse;
        this.Port = port;
        this.location = location;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        Port = port;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", HospitalName='" + HospitalName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", hostId='" + hostId + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", Port=" + Port +
                ", location=" + location +
                '}';
    }
}
