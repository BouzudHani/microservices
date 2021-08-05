package host2.repo;


import host2.data.BloodType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BloodTypeRepo extends MongoRepository<BloodType,Integer> {
}
