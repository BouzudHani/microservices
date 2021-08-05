package host2.repo;


import host2.data.EmergencyCall;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmergencyCallRepo extends MongoRepository<EmergencyCall, Integer> {
}
