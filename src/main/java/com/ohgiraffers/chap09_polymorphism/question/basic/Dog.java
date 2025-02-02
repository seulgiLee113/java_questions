package com.ohgiraffers.chap09_polymorphism.question.basic;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("강아지가 짖는다.");
    }
}
