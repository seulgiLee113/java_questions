package com.ohgiraffers.chap11_generic.question.basic;

public class Container <T> {
    private T data;

    // getter
    public T getData() {
        return data;
    }

    //setter
    public void setAddData(T data) {
        this.data = data;
    }
}
