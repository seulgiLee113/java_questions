package com.ohgiraffers.chap09_polymorphism.hard;

public class Boat extends Vehicle {

    public String hullType;

    @Override
    public void move() {
        System.out.println("보트가 물 위를 떠다닙니다.");
    }
}
