package com.ohgiraffers.chap11_generic.question.basic;

public class Box <T> {
    private T data;

    public Box() {
    };

    // getter
    public T getBox() {
        return data;
    }

    //setter
    public void setBox(T data) {
        this.data = data;
    }

    //public void toString(T data) {
    //    System.out.println("문자열 데이터 : " + data);
    //}
}
