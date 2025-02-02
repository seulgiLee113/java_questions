package com.ohgiraffers.chap08_inheritance.question.normal;

public class Employee {

    private String name;
    private int salary;

    public Employee() {

    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInfo(String name, int salary) {
        System.out.println("이름 : " + name + ", 연봉" + salary) ;
    }
}
