package test_security.sec.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test_security.sec.Entity.AppRole;

@RepositoryRestResource
public interface AppRoleRepo extends JpaRepository<AppRole,Long> {
    public AppRole findRoleByRoleName(String roleName);
}
