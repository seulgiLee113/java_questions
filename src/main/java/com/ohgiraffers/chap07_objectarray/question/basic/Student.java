package com.ohgiraffers.chap07_objectarray.question.basic;

public class Student {

    String name;
    int score;

    // 생성자 만들어야됨
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 메서드
    public void printStudent() {
        System.out.println("이름 : " + name + " 점수 : " + score);
    }
}
