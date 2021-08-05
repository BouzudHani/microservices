package drivers2.driv2.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Driver {
    @Id
    private int id;
    private String name;
    private String PhoneNumber;
    private boolean Available ;

    public  Driver(){

    }
    public Driver(int id, String name, String phoneNumber, boolean available) {
        this.id = id;
        this.name = name;
        PhoneNumber = phoneNumber;
        Available = available;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Available='" + Available + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public boolean getAvailable() {
        return Available;
    }

    public void setAvailable(boolean available) {
        Available = available;
    }
}
