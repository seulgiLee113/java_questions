package com.ohgiraffers.chap08_inheritance.question.basic;

public class Person {
    // 부모 클래스

    private String name;
    private int age;

    public void selfIntroduction(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("이름 : " + name + ", 나이 : " + age);
    }
}
