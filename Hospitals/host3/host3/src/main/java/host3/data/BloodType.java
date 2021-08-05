package host3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BloodType {
    @Id
    private int id;
    private String BloodType;
    private int percentage;
    private boolean Alert;

    public BloodType(){
    }
    public BloodType(int id, String bloodType, int percentage ) {
        this.id = id;
        BloodType = bloodType;
        this.percentage = percentage;
        this.Alert=false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
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
        isAlert();
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
                "Id=" + id +
                ", BloodType='" + BloodType + '\'' +
                ", percentage=" + percentage +
                ", Alert=" + isAlert() +
                "% }";
    }
}
