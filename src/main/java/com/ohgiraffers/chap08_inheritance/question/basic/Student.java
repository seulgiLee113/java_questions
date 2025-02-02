package com.ohgiraffers.chap08_inheritance.question.basic;

public class Student extends Person{

    private int studentId;

    public void study(int studentId) {
        System.out.println("공부 중");
    }
}
