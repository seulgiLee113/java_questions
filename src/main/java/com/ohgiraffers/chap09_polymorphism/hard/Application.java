package com.ohgiraffers.chap09_polymorphism.hard;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car());
        vehicles.add(new Boat());

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
