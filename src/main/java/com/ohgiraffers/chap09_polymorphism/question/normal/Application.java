package com.ohgiraffers.chap09_polymorphism.question.normal;

public class Application {
    public static void main(String[] args) {
        /* Q1. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 다형성을 활용한 메소드 호출을 구현하세요.
         *
         * 복습 포인트:
         * - 다형성의 개념을 이해하고 설명할 수 있다.
         * - 부모 클래스 타입의 변수로 자식 클래스 객체를 참조할 수 있다.
         * - 부모 클래스의 메소드를 자식 클래스에서 오버라이딩할 수 있다.
         *
         * 클래스명: Employee (부모 클래스)
         * 필드: 이름(name, 문자열), 연봉(salary, 정수)
         * 메소드: 정보 출력(printInfo) - 이름과 연봉을 출력
         *
         * 클래스명: Manager (자식 클래스)
         * 필드: 부서(department, 문자열)
         * 메소드: 정보 출력(printInfo) - 이름, 연봉, 부서를 출력 (메소드 오버라이딩)
         *
         * 클래스명: Developer (자식 클래스)
         * 필드: 프로그래밍 언어(language, 문자열)
         * 메소드: 정보 출력(printInfo) - 이름, 연봉, 프로그래밍 언어를 출력 (메소드 오버라이딩)
         *
         * Employee 타입의 배열을 생성하고, Manager와 Developer 객체를 배열에 추가한 후, 배열을 순회하며 정보 출력 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 이름: 김직원, 연봉: 5000
         * 이름: 박매니저, 연봉: 7000, 부서: 인사부
         * 이름: 이개발자, 연봉: 6000, 언어: Java
         * */

        // Employee 타입의 배열 생성
        Employee[] employees = new Employee[2];

        // Manager, Developer 객체를 배열에 추가
        employees[0] = new Manager("박매니저", 7000, "인사부");
        employees[1] = new Developer("이개발자", 6000, "JAVA");

        Employee employee = new Employee("김직원", 5000);
        employee.printInfo();

        for (Employee e : employees) {
            e.printInfo();
        }

        /* Q2. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 다형성을 활용한 메소드 호출을 구현하세요.
         *
         * 복습 포인트:
         * - 다형성의 개념을 이해하고 설명할 수 있다.
         * - 인터페이스를 활용하여 다형성을 구현할 수 있다.
         *
         * 인터페이스명: Payment
         * 메소드: 결제하다(pay) - 결제 방법을 출력
         *
         * 클래스명: CreditCard (구현 클래스)
         * 메소드: 결제하다(pay) - "신용카드로 결제합니다." 출력 (인터페이스 메소드 구현)
         *
         * 클래스명: Cash (구현 클래스)
         * 메소드: 결제하다(pay) - "현금으로 결제합니다." 출력 (인터페이스 메소드 구현)
         *
         * Payment 타입의 배열을 생성하고, CreditCard와 Cash 객체를 배열에 추가한 후, 배열을 순회하며 결제하다 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 신용카드로 결제합니다.
         * 현금으로 결제합니다.
         * */

        Payment[] payments = new Payment[2];
        payments[0] = new CreditCard();
        payments[1] = new Cash();

        for (Payment p : payments) {
            p.Pay();
        }
    }
}
