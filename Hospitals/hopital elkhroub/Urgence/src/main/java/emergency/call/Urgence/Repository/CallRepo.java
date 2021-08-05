package emergency.call.Urgence.Repository;

import emergency.call.Urgence.Document.EmergencyCall;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CallRepo  extends MongoRepository<EmergencyCall,Integer> {
}
