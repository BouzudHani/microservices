package host2.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ambulance {
    @Id
    private int id;
    private String matricule;
    private boolean dispanible;

    public Ambulance() {
    }

    public Ambulance(int id, String matricule, boolean dispanible) {
        this.id = id;
        this.matricule = matricule;
        this.dispanible = dispanible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public boolean isDispanible() {
        return dispanible;
    }

    public void setDispanible(boolean dispanible) {
        this.dispanible = dispanible;
    }

    @Override
    public String toString() {
        return "Ambulance{" +
                "id=" + id +
                ", matricule='" + matricule + '\'' +
                ", dispanible=" + dispanible +
                '}';
    }
}
