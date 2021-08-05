package Ambulances2.Amb2.Repository;

import Ambulances2.Amb2.Data.Ambulance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AmbulanceRepo extends MongoRepository<Ambulance,Integer> {
}
