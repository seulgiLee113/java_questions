package com.ohgiraffers.chap06_class_and_object.question.normal;

public class Account {

    private String accountNumber;  // 계좌번호
    private int balance; // 잔액

    public void Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Account 메서드 실행" + accountNumber + " " + balance);
    }

    // 잔액입금
    public void deposit(int amount) {
        this.balance = amount;
        System.out.println("deposit 메서드 실행" + amount);

    }

    // 잔액 조회
    public String getBalance() {
        return "계좌번호" + accountNumber + "\n" + "잔액 : " + balance;
    }

}
