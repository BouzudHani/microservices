package test_security.sec.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test_security.sec.Entity.AppUser;

@RepositoryRestResource
public interface AppUserRepo extends JpaRepository<AppUser,Long> {
    public AppUser findUserByUserName(String UserName);
}
