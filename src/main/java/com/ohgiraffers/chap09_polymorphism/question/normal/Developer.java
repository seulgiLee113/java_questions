package com.ohgiraffers.chap09_polymorphism.question.normal;

public class Developer extends Employee {
    public String language;

    public Developer(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    public void printInfo() {
        System.out.println("이름 : " + getName() + ", 연봉 : " + getSalary() + ", 언어 : " + language);
    }
}
