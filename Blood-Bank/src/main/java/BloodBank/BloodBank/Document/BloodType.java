package BloodBank.BloodBank.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BloodType {

    @Id
    private int Id;
    private String BloodType;
    private int percentage;
    private boolean Alert;

    public BloodType(){
    }
    public BloodType(int id, String bloodType, int percentage ) {
        Id = id;
        BloodType = bloodType;
        this.percentage = percentage;
        this.Alert=false;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String bloodType) {
        BloodType = bloodType;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        if (percentage>=0 && percentage<= 100 ) this.percentage = percentage;
    }

    public boolean isAlert() {
        if (percentage<=10) return Alert=true;
        else return Alert=false;
    }

    public void setAlert(boolean alert) {
        Alert=alert;
    }

    @Override
    public String toString() {
        return "BloodType{" +
                "Id=" + Id +
                ", BloodType='" + BloodType + '\'' +
                ", percentage=" + percentage +
                ", Alert=" + isAlert() +
                "% }";
    }
}
