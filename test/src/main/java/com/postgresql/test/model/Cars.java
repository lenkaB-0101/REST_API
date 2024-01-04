package com.postgresql.test.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;


@Entity
@Table(name="cars")
public class Cars {
    @Id
    @Column(name="car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="car_name")
    private String car_name;

    @Column(name="year_made")
    private String year_made;

    public Cars(Long id) {
        this.id = id;
    }

    public Cars(Long id, String car_name, String year_made) {
        this.id = id;
        this.car_name = car_name;
        this.year_made = year_made;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getYear_made() {
        return year_made;
    }

    public void setYear_made(String year_made) {
        this.year_made = year_made;
    }
}
