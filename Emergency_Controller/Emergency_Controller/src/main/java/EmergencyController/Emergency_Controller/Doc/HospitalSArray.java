package EmergencyController.Emergency_Controller.Doc;

public class HospitalSArray {
    private Hospital hospital;
    private double Distance ;

    public HospitalSArray(){
    }

    public HospitalSArray(Hospital hospital, double distance) {
        this.hospital = hospital;
        Distance = distance;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public double getDistance() {
        return Distance;
    }

    public void setDistance(double distance) {
        Distance = distance;
    }
}
