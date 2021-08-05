package EmergencyController.Emergency_Controller.Doc;

public class Location {
    private double Latitude ;
    private double longitude;
    private String PatientName;

    public Location(){
    }

    public Location(double latitude, double longitude,String PatientName) {
        this.Latitude = latitude;
        this.longitude = longitude;
        this.PatientName= PatientName;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "Latitude=" + Latitude +
                ", longitude=" + longitude +
                ", PatientName='" + PatientName + '\'' +
                '}';
    }
}
