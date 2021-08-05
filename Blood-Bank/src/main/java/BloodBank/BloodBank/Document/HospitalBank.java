package BloodBank.BloodBank.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class HospitalBank {

    @Id
    private int id;
    private List<BloodType> bloodTypes;
    private Hospital hospital;

}
