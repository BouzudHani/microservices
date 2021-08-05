package Ambulances1.Amb1.Repository;

import Ambulances1.Amb1.Data.Ambulance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AmbulanceRepo extends MongoRepository<Ambulance,Integer> {

}
