package com.ohgiraffers.chap09_polymorphism.hard;

public class Car extends Vehicle {

    public String fuelType;

    @Override
    public void move() {
        System.out.println("자동차가 도로를 달립니다.");
    }
}
