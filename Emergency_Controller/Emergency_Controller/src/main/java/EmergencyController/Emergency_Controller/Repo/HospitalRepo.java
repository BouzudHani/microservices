package EmergencyController.Emergency_Controller.Repo;

import EmergencyController.Emergency_Controller.Doc.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HospitalRepo extends MongoRepository<Hospital,Integer> {
}
