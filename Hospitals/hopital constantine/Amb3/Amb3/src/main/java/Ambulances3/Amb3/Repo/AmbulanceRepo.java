package Ambulances3.Amb3.Repo;

import Ambulances3.Amb3.Data.Ambulance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AmbulanceRepo extends MongoRepository<Ambulance,Integer> {

}
