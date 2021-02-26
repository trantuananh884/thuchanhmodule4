package com.example.thuchanhmodule4.repository;

import com.example.thuchanhmodule4.model.City;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

@Service
public interface CityRepository extends PagingAndSortingRepository<City,Long> {
}
