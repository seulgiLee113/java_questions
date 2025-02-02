package com.ohgiraffers.chap09_polymorphism.question.basic;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("원의 면적 : " + radius * radius * 3.14);
    }
}
