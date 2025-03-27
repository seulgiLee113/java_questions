package com.ohgiraffers.chap10_api.basic;

import java.sql.Array;

public class Application {

    public static void main(String[] args) {

        /* Q1. Object 클래스의 toString() 메소드를 오버라이딩하여 객체의 정보를 출력하세요.
         *
         * 복습 포인트:
         * - toString() 메소드 오버라이딩 목적을 이해하고 개발에 적용할 수 있다.
         *
         * 클래스명: Person
         * 필드: 이름(name, 문자열), 나이(age, 정수)
         *
         * Person 클래스의 toString() 메소드를 오버라이딩하여 이름과 나이를 출력
         *
         * Person 객체를 생성하고 toString() 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 이름: 홍길동, 나이: 20
         * */

        Person person = new Person("홍길동", 20);
        System.out.println(person);


        /* Q2. String 클래스의 메소드를 활용하여 문자열을 분리하고, 특정 문자열을 포함하는지 확인하세요.
         *
         * 복습 포인트:
         * - 문자열 비교 시 ==과 equals() 메소드의 비교 방식을 이해하고 개발에 적용할 수 있다.
         * - 문자열을 분리하는 방식을 이해하고 개발에 적용할 수 있다. (split()과 StringTokenizer)
         *
         * 문자열: "Java,Python,C++,JavaScript"
         *
         * 쉼표(,)를 기준으로 문자열을 분리하여 배열로 저장하고, "Python" 문자열이 포함되어 있는지 확인
         *
         * 출력 예시:
         * Python이 포함되어 있습니다.
         * */

        String string = "Java,Python,C++,JavaScript";

        String[] string1 = string.split(",");
        for (String s : string1){
//            System.out.println(s);
//            System.out.println(s.equals(s));    // true
            if(s.equals("Python")) {
                System.out.println(s + "이 포함되어 있습니다.");
            } else {
            System.out.println(s);
            }
        }
    }
}
