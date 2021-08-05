package emergency.call.Urgence.Document;

public class Driver {
    private String name;
    private String PhoneNumber;

    public Driver(){

    }
    public Driver(String name, String phoneNumber) {
        this.name = name;
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Driver{" +
                ", name='" + name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
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


}
