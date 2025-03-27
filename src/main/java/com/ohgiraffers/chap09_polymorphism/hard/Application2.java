package com.ohgiraffers.chap09_polymorphism.hard;

import java.util.ArrayList;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        List<Appliance> appliances = new ArrayList<>();

        appliances.add(new WashingMachine());
        appliances.add(new Refrigerator());

        for (Appliance appliance : appliances) {
            appliance.operate();
        }
    }
}
