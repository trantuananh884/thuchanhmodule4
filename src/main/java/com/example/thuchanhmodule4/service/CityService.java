package com.example.thuchanhmodule4.service;

import com.example.thuchanhmodule4.model.City;
import com.example.thuchanhmodule4.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    CityRepository cityRepository;
    @Autowired

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    public List<City> findAllCity(){
        return (List<City>)cityRepository.findAll();
    }
    public void save(City city){
        cityRepository.save(city);
    }
    public City findById(Long id){
        return cityRepository.findById(id).orElse(null);
    }
    public void delete(Long id){
        cityRepository.deleteById(id);
    }
}
