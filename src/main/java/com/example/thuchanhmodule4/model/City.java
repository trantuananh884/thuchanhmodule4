package com.example.thuchanhmodule4.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
private String name;
private Long square;
private Long population;
private Long GDP;
private String desciption;
@ManyToOne
@JoinColumn(name = "country_id")
    private Country country;

    public City() {
    }

    public City(String name, Long square, Long population, Long GDP, String desciption, Country country) {
        this.name = name;
        this.square = square;
        this.population = population;
        this.GDP = GDP;
        this.desciption = desciption;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSquare() {
        return square;
    }

    public void setSquare(Long square) {
        this.square = square;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getGDP() {
        return GDP;
    }

    public void setGDP(Long GDP) {
        this.GDP = GDP;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public Country getCountry() {
        return country;
    }
    public String getCountryName(){
        return this.country.getName();
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
