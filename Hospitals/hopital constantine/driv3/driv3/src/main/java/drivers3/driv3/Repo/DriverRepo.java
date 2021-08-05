package drivers3.driv3.Repo;

import drivers3.driv3.Doc.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestResource
public interface DriverRepo extends MongoRepository<Driver,Integer> {
}
