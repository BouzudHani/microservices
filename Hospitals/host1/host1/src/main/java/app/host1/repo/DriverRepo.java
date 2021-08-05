package app.host1.repo;

import app.host1.data.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DriverRepo extends MongoRepository<Driver,Integer> {
}
