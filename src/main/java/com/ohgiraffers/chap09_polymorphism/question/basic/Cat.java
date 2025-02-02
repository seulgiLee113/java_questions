package com.ohgiraffers.chap09_polymorphism.question.basic;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("고양이가 야옹한다.");
    }
}
