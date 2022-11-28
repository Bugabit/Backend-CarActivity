package com.activity.car.service;

import com.activity.car.entity.Car;
import com.activity.car.entity.Map;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CarService {

    // DIRECTIONS
    final String UP = "w";
    final String DOWN = "s";
    final String LEFT = "a";
    final String RIGHT = "d";

    Map map;
    Car car;

    public CarService() {
        restart();
    }

    public void restart() {
        car = new Car(1);
        map = new Map();

        // INITIALIZE
        map.defineMap();
        car.setPosX(map.getMatrix()[0].length / 2);
        car.setPosY(map.getMatrix().length - 1);
    }

    public void move(String direction) {
        if (!movePosition(direction)) {
            return;
        }

        updateHearts();
    }

    // Move the car to the selected square
    private boolean movePosition(String direction) {
        switch (direction) {
            case UP:
                if (car.getPosY() - 1 < 0) {
                    car.setPosY(map.getMatrix().length);
                }
                car.setPosY(car.getPosY() - 1);
                break;
            case DOWN:
                if (car.getPosY() + 1 >= map.getMatrix().length) {
                    car.setPosY(-1);
                }
                car.setPosY(car.getPosY() + 1);
                break;
            case LEFT:
                if (car.getPosX() - 1 < 0) {
                    car.setPosX(map.getMatrix()[0].length);
                }
                car.setPosX(car.getPosX() - 1);
                break;
            case RIGHT:
                if (car.getPosX() + 1 >= map.getMatrix()[0].length) {
                    car.setPosX(-1);
                }
                car.setPosX(car.getPosX() + 1);
                break;
            default:
                return false;
        }
        return true;
    }

    // Check the current box and perform the corresponding action
    public void updateHearts() {
        int position = map.getMatrix()[car.getPosY()][car.getPosX()];
        car.setHearts(car.getHearts() + position);
    }

    public java.util.Map<String, Integer> getCarData() {
        java.util.Map<String, Integer> data = new HashMap<>();
        data.put("posX", car.getPosX());
        data.put("posY", car.getPosY());
        data.put("vidas", car.getHearts());
        return data;
    }
}