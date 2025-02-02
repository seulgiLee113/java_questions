package com.ohgiraffers.chap08_inheritance.question.basic;

public class Dog extends Animal{

    @Override
    public void makesound() {
        System.out.println("강아지가 짖는다.");
    }
}
