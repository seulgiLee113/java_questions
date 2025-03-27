package com.ohgiraffers.chap09_polymorphism.hard;

public class WashingMachine implements Appliance {

    @Override
    public void operate() {
        System.out.println("세탁기가 작동합니다.");
    }
}
