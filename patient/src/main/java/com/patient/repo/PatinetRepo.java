package com.patient.repo;

import com.patient.data.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PatinetRepo extends MongoRepository<Patient, Integer> {
}
