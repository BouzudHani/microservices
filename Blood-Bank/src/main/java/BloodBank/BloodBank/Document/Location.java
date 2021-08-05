package BloodBank.BloodBank.Document;

public class Location {
    private double Latitude ;
    private double longitude;

    public Location(){
    }

    public Location(double latitude, double longitude) {
        Latitude = latitude;
        this.longitude = longitude;
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
                '}';
    }
}
