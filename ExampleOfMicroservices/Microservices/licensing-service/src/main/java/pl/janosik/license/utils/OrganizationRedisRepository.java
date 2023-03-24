package pl.janosik.license.utils;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Organization;

@Repository
public interface OrganizationRedisRepository extends CrudRepository<Organization,String>  {
}
