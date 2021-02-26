package com.example.thuchanhmodule4.controller;

import com.example.thuchanhmodule4.model.City;
import com.example.thuchanhmodule4.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping
public class CityController {
    private CityService cityService;
    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(name = "")
    public ModelAndView index(){
        List<City>cityList = cityService.findAllCity();
        return new ModelAndView("/index","cityList",cityList);

    }
    @GetMapping(value = "/view/{id}")
    public ModelAndView showView(@PathVariable(name = "id") Long id){
        City city = cityService.findById(id);
        return new ModelAndView("/view","city", city);

    }
    @GetMapping(value = "/delete/{id}")
    public ModelAndView deleteCity(@PathVariable(name = "id") Long id){
        cityService.delete(id);
        return index();
    }
    @GetMapping(value = "/edit/{id}")
    public ModelAndView showEdit(@PathVariable(name = "id") Long id){
        City city = cityService.findById(id);
        return new ModelAndView("edit","city", city);
    }
    @PostMapping(value = "/edit/{id}")
    public ModelAndView edit (@ModelAttribute(name = "city") City city,@PathVariable(name = "id") Long id, @RequestParam(name = "countryname") String countryname){

    }
}
