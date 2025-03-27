package com.ohgiraffers.chap11_generic.question.normal;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("Generics");
        arrayList.add("Java");

        List<Integer> arrayList2 = new ArrayList<>();

        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);

        printList(arrayList);
        printList(arrayList2);


        NumberBox numberBox = new NumberBox();

        numberBox.addNumber(10);
        numberBox.addNumber(20);
        numberBox.addNumber(30.5);
        numberBox.addNumber(40.7);
        System.out.println(numberBox.getNumbers());

    }

    public static <T> void printList(List<T> list) {
        System.out.println(list);
    }
}
