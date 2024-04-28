package com.archie.ShowPal.service;

import com.archie.ShowPal.model.City;
import com.archie.ShowPal.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City saveCity(String cityName){
        City city = new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }

    public City getCityById(int cityId){
        Optional<City> optionalCity =  cityRepository.findById(cityId);
        return optionalCity.get();
    }
    public List<City> getAllCities(){
        return cityRepository.findAll();
    }



}
