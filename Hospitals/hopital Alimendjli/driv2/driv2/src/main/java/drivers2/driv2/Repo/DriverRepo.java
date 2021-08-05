package drivers2.driv2.Repo;

import drivers2.driv2.Document.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DriverRepo extends MongoRepository<Driver,Integer> {

}
