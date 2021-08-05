package drivers1.driv1.Repo;

import drivers1.driv1.Document.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface DriverRepo extends MongoRepository<Driver,Integer> {
}
