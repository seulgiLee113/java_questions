package com.ohgiraffers.chap11_generic.question.basic;

public class Application {
    public static void main(String[] args) {

        Box<String> box = new Box<>();
        Box<Integer> box2 = new Box<>();

        box.setBox("Hello, Generics!");
        System.out.println("문자열 데이터 : " + box.getBox());

        box2.setBox(123);
        System.out.println("정수 데이터 : " + box2.getBox());


        Container<Double> container = new Container<>();

        container.setAddData(45.67);
        System.out.println("Double 데이터 : " + container.getData());

    }
}
