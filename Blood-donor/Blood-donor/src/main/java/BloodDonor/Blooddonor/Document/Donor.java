package BloodDonor.Blooddonor.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Donor {
        @Id
        private int id;
        private String Name;
        private String PhoneNomber;
        private String Email;
        private String BloodType;
        private String Adresse;

    public Donor() {

    }
    public Donor(int id, String name, String phoneNomber, String email, String bloodType, String adresse) {
        this.id = id;
        Name = name;
        PhoneNomber = phoneNomber;
        Email = email;
        BloodType = bloodType;
        Adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNomber() {
        return PhoneNomber;
    }

    public void setPhoneNomber(String phoneNomber) {
        PhoneNomber = phoneNomber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String bloodType) {
        BloodType = bloodType;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    @Override
    public String toString() {
        return "Donor{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", PhoneNomber='" + PhoneNomber + '\'' +
                ", Email='" + Email + '\'' +
                ", BloodType='" + BloodType + '\'' +
                ", Adresse='" + Adresse + '\'' +
                '}';
    }
}
