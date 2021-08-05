package EmergencyController.Emergency_Controller.Repo;

import EmergencyController.Emergency_Controller.Doc.EmergencyCall;
import org.springframework.data.mongodb.core.MongoAdminOperations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmergencyCallRepo extends MongoRepository<EmergencyCall,Integer> {

}
