package com.ohgiraffers.chap11_generic.question.hard;

public class MultiBox<T, V> {

    private T firstData;
    private V secondData;

    public MultiBox(T firstData, V secondData) {
        this.firstData = firstData;
        this.secondData = secondData;
    }

    public MultiBox() {

    }

    public void setFirstData(T firstData) {
        this.firstData = firstData;
    }

    public void setSecondData(V secondData) {
        this.secondData = secondData;
    }

    public T getFirstData() {
        return firstData;
    }

    public V getSecondData() {
        return secondData;
    }


    public String printData() {
        return "첫 번째 데이터 : " + firstData + ", 두 번째 데이터 : " + secondData;
    }
}
