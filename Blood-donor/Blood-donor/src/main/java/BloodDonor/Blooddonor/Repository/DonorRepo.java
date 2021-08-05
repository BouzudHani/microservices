package BloodDonor.Blooddonor.Repository;

import BloodDonor.Blooddonor.Document.Donor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DonorRepo extends MongoRepository<Donor,Integer> {

}
