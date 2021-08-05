package emergency.call.Urgence.Document;

public class Ambulance {
    private String matricule;

    public Ambulance(){

    }
    public Ambulance(String matricule) {
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Ambulance{" +
                ", matricule='" + matricule + '\'' +
                '}';
    }
}
