package com.ohgiraffers.chap12_collection.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Application {

    public static void main(String[] args) {

        // Question 1.
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(2);

        Collections.sort(arrayList);
        System.out.println(arrayList);


        // Question 2.
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        System.out.println("첫 번째 요소 : " + linkedList.pop());
        System.out.println("마지막 요소 : " + linkedList.getLast());
    }
}
