package com.ohgiraffers.chap09_polymorphism.hard;

public class Refrigerator implements Appliance {

    @Override
    public void operate() {
        System.out.println("냉장고가 작동합니다.");
    }
}
