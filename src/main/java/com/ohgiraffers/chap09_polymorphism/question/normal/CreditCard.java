package com.ohgiraffers.chap09_polymorphism.question.normal;

public class CreditCard implements Payment{
    @Override
    public void Pay() {
        System.out.println("신용카드로 결제합니다.");
    }
}
