package com.ohgiraffers.chap09_polymorphism.question.normal;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // name, salary를 사용하기 위한 getter 생성
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void printInfo() {
        System.out.println("이름 : " + name + ", 연봉 : " + salary);
    }
}
