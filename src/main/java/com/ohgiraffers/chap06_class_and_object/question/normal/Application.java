package com.ohgiraffers.chap06_class_and_object.question.normal;

public class Application {

    public static void main(String[] args) {

        /* Q1. 다음 조건에 맞는 클래스를 작성하고, 인스턴스를 생성하여 필드를 출력하세요.
         *
         * 복습 포인트:
         * - 캡슐화를 적용하지 않는 경우 문제점이 무엇인지 이해할 수 있다.
         * - 접근 제한자에 대해 이해할 수 있다.
         * - 캡슐화를 적용하여 클래스를 작성할 수 있다.
         *
         * 클래스명: Account
         * 필드: 계좌번호(accountNumber, 문자열), 잔액(balance, 정수)
         *
         * 필드는 private으로 설정
         * 잔액을 입금하는 메소드 deposit(int amount)
         * 잔액을 조회하는 메소드 getBalance()
         *
         * 인스턴스 생성: 계좌번호는 "123-456", 잔액은 0으로 설정
         * 5000을 입금 후 잔액을 출력
         *
         * 출력 예시:
         * 계좌번호: 123-456
         * 잔액: 5000
         * */
        Account account = new Account();
        account.Account("123-456", 0);

        account.deposit(5000);

        System.out.println(account.getBalance());


        /* Q2. 다음 조건에 맞는 메소드를 오버로딩하여 작성하세요.
         *
         * 복습 포인트:
         * - 오버로딩이 무엇인지 설명할 수 있다.
         * - 오버로딩의 성립 요건에 대해 설명할 수 있다.
         *
         * 클래스명: Calculator
         * 메소드: add
         * - 정수 두 개를 더하는 메소드 add(int a, int b)
         * - 정수 세 개를 더하는 메소드 add(int a, int b, int c)
         *
         * 메소드 호출: 두 개의 정수(3, 5)를 더한 결과와 세 개의 정수(1, 2, 3)를 더한 결과를 출력
         *
         * 출력 예시:
         * 3 + 5 = 8
         * 1 + 2 + 3 = 6
         * */


        Calculator calc = new Calculator();

        System.out.println(calc.add(3, 5));
        System.out.println(calc.add(1, 2, 3));
    }
}
