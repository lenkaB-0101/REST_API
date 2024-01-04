package com.postgresql.test.repo;

import com.postgresql.test.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarsRepo extends JpaRepository<Cars, Long> {

    CarsRepo findByCar_nameAndYear_made(String car_name, String year_made);
}
