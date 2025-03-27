package com.ohgiraffers.chap11_generic.question.normal;

import java.util.ArrayList;
import java.util.List;

public class NumberBox {

    private List<? extends Number> numbers = new ArrayList<>();

    public NumberBox() {
    }

    public void Numberbox(List<? extends Number> numbers) {
        this.numbers = numbers;
    }

    public void addNumber(Number number) {
        List<Number> tempList = new ArrayList<>(numbers);
        tempList.add(number);
        numbers = tempList;
    }

   public List<? extends Number> getNumbers() {
        return numbers;
   }
}
