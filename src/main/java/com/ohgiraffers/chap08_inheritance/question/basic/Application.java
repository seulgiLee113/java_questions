package com.ohgiraffers.chap08_inheritance.question.basic;

public class Application {
    public static void main(String[] args) {

        /* Q1. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 메소드를 호출하세요.
         *
         * 복습 포인트:
         * - 상속의 개념을 이해하고 설명할 수 있다.
         * - 부모 클래스와 자식 클래스의 관계를 이해할 수 있다.
         *
         * 클래스명: Person (부모 클래스)
         * 필드: 이름(name, 문자열), 나이(age, 정수)
         * 메소드: 자기소개(selfIntroduction) - 이름과 나이를 출력
         *
         * 클래스명: Student (자식 클래스)
         * 필드: 학번(studentId, 정수)
         * 메소드: 공부하기(study) - "공부 중" 메시지 출력
         *
         * Person 객체와 Student 객체를 생성하고, 각각의 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 이름: 홍길동, 나이: 20
         * 공부 중
         */

        Person person = new Person();
        Student student = new Student();

        person.selfIntroduction("홍길동", 20);
        student.study(0);


        /* Q2. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 메소드를 호출하세요.
         *
         * 복습 포인트:
         * - 상속의 개념을 이해하고 설명할 수 있다.
         * - 메소드 오버라이딩의 개념을 이해하고 적용할 수 있다.
         *
         * 클래스명: Animal (부모 클래스)
         * 메소드: 소리내기(makeSound) - "동물이 소리를 낸다." 출력
         *
         * 클래스명: Dog (자식 클래스)
         * 메소드: 소리내기(makeSound) - "강아지가 짖는다." 출력 (메소드 오버라이딩)
         *
         * Animal 객체와 Dog 객체를 생성하고, 각각의 소리내기 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 동물이 소리를 낸다.
         * 강아지가 짖는다.
         * */

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makesound();
        dog.makesound();
    }

}
