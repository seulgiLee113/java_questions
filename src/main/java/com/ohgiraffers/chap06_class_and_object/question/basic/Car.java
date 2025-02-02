package com.ohgiraffers.chap06_class_and_object.question.basic;

public class Car {

    String model;
    int price;

    Car() {
        this.model = "기본모델";
        this.price = 1000;
    }

    Car(String model, int price) {
        this.model = model;
        this.price = price;
    }
}
