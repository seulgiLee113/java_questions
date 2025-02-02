package com.ohgiraffers.chap06_class_and_object.question.hard;

public class Singleton {

    // Eager Initialization (이른 초기화) 기법
    //싱글턴 클래스 객체를 담을 인스턴스 변수 선언. 클래스가 초기화되는 시점에 인스턴스 바로 생성
    private static Singleton instance = new Singleton();

    // 외부에서 new를 사용하여 인스턴스를 생성할 수 없도록 생성자를 private로 지정한다.
    private Singleton() {}

    // getInstance() 메서드를 통해 인스턴스 얻기
    // public 접근제한자를 설정해 인스턴스(주소)를 반환하도록 한다.
    public static Singleton getInstance() {
        return instance;
    }
}
