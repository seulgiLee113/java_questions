package com.ohgiraffers.chap03_methodapi.question.basic;

public class Calculator {

    public void checkMethod() {
        System.out.println("함수 호출 확인용 메소드");
    }

    public int sumTwoNumber(int a, int b) {
        return (a + b);
    }
    public int minusNumber(int a, int b) {
        return (a - b);
    }
    public int multiNumber(int a, int b) {
        return (a * b);
    }
    public int divideNumber(int a, int b) {
        return (a / b);
    }
}
