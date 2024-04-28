package com.archie.ShowPal.controller;

import com.archie.ShowPal.dto.CityRequestDTO;
import com.archie.ShowPal.exception.InvalidCityNameException;
import com.archie.ShowPal.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO){
        String cityName = cityRequestDTO.getName();
        if(cityName == null || cityName.isEmpty() || cityName.isBlank()) throw new InvalidCityNameException("Please enter valid city name");
        return ResponseEntity.ok(cityService.saveCity(cityName));
    }

    @GetMapping("/city")
    public ResponseEntity getAllCities(){
        return ResponseEntity.ok(cityService.getAllCities());
    }

    @GetMapping("/city/{id}")
    public ResponseEntity getCityById(@PathVariable("id") int id){
        return ResponseEntity.ok(cityService.getCityById(id));
    }
}
