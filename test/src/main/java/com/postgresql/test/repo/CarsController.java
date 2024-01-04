package com.postgresql.test.repo;

import com.postgresql.test.model.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CarsController {

    private com.postgresql.test.repo.CarsRepo CarsRepo;
    @Autowired
    CarsRepo repo;

    public CarsController(com.postgresql.test.repo.CarsRepo carsRepo) {
        CarsRepo = carsRepo;
    }

    public void Controller(CarsRepo carsRepo) {
        this.CarsRepo = carsRepo;
    }

    @PostMapping("/addCar")
    public void addCar(@RequestBody Cars car) {
        repo.save(car);
    }

}
