package com.ohgiraffers.chap12_collection.normal;

import java.util.HashSet;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {

        // Question 1.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("apple");

        System.out.println("hashSet = " + hashSet);
        System.out.println("HashSet의 크기 : " + hashSet.size());


        // Question 2.
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(2);

        System.out.println("treeSet = " + treeSet);
        System.out.println("TreeSet의 요소 : " + treeSet);
    }
}
