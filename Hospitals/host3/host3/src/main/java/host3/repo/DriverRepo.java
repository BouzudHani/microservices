package host3.repo;

import host3.data.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DriverRepo extends MongoRepository<Driver,Integer> {
}
