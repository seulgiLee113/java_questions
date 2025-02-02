package com.ohgiraffers.chap08_inheritance.question.normal;

public class Manager extends Employee{

    public String department;
    public Manager() {

    }

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void printInfo(String name, int salary)  // 매개변수ㅠ 맞춰야 함
    {
        super.printInfo(name, salary);
        // 이렇게 쓰면 부모의 printInfo를 사용할 수 있다!!
    }

    public void printInfo(String name, int salary, String department) {
        super.printInfo(name, salary); // 부모 메서드 호출
        System.out.println("이름 : " + name + ", 연봉: " + salary + ", 부서: " + department);
    }
}
