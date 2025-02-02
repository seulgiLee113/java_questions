package com.ohgiraffers.chap09_polymorphism.question.normal;

public class Cash implements Payment{
    @Override
    public void Pay() {
        System.out.println("현금으로 결제합니다.");
    }
}
