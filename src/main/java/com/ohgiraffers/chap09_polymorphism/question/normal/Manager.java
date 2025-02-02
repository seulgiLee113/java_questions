package com.ohgiraffers.chap09_polymorphism.question.normal;

public class Manager extends Employee{

    private String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void printInfo() {
        // 부모 클래스의 getter 메서드 사용하기
        System.out.println("이름 : " + getName() + ", 연봉 : " + getSalary() + ", 부서 : " + department);
    }
}
