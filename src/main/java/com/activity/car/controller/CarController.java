package com.activity.car.controller;

import com.activity.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping
@CrossOrigin
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("move")
    public Map<String, Integer> moveCar(@RequestBody Map<String, String> direction) {
        String key = direction.get("key");
        carService.move(key);
        return carService.getCarData();
    }
}