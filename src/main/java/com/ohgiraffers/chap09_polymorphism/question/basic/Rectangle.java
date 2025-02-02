package com.ohgiraffers.chap09_polymorphism.question.basic;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("사각형의 면적 : " + width * height);
    }
}
