package app.host1.data;

public class location {
    private double Latitude ;
    private double longitude;
    private String PatientName;

    public location(){
    }

    public location(double latitude, double longitude,String PatientName) {
        this.Latitude = latitude;
        this.longitude = longitude;
        this.PatientName = PatientName;
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
        return "location{" +
                "Latitude=" + Latitude +
                ", longitude=" + longitude +
                ", PatientName='" + PatientName + '\'' +
                '}';
    }
}
