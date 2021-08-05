package app.host1.repo;

import app.host1.data.Ambulance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AmbulanceRep extends MongoRepository<Ambulance,Integer> {
}
