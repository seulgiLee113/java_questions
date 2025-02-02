package com.ohgiraffers.chap09_polymorphism.question.basic;

public class Application {
    public static void main(String[] args) {
        /* Q1. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 다형성을 적용한 메소드를 호출하세요.
         *
         * 복습 포인트:
         * - 다형성의 개념을 이해하고 설명할 수 있다.
         * - 부모 클래스 타입의 변수로 자식 클래스 객체를 참조할 수 있다.
         * - 부모 클래스의 메소드를 자식 클래스에서 오버라이딩할 수 있다.
         *
         * 클래스명: Animal (부모 클래스)
         * 메소드: 소리내기(makeSound) - "동물이 소리를 낸다." 출력
         *
         * 클래스명: Dog (자식 클래스)
         * 메소드: 소리내기(makeSound) - "강아지가 짖는다." 출력 (메소드 오버라이딩)
         *
         * 클래스명: Cat (자식 클래스)
         * 메소드: 소리내기(makeSound) - "고양이가 야옹한다." 출력 (메소드 오버라이딩)
         *
         * Animal 타입의 배열을 생성하고, Dog와 Cat 객체를 배열에 추가한 후, 배열을 순회하며 소리내기 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 강아지가 짖는다.
         * 고양이
         */
        // Animal 타입의 배열 생성
        Animal[] animal = new Animal[2];

        // Dog와 Cat 객체를 배열에 추가
        animal[0] = new Dog();
        animal[1] = new Cat();

        // 배열을 순회하며 소리내기 메소드 출력
        for (Animal a : animal) {
            a.makeSound();
        }


        /* Q2. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 다형성을 적용한 메소드를 호출하세요.
         *
         * 복습 포인트:
         * - 다형성의 개념을 이해하고 설명할 수 있다.
         * - 부모 클래스 타입의 변수로 자식 클래스 객체를 참조할 수 있다.
         * - 부모 클래스의 메소드를 자식 클래스에서 오버라이딩할 수 있다.
         *
         * 클래스명: Shape (부모 클래스)
         * 메소드: 면적 계산(calculateArea) - "도형의 면적을 계산합니다." 출력
         *
         * 클래스명: Circle (자식 클래스)
         * 필드: 반지름(radius, 실수)
         * 메소드: 면적 계산(calculateArea) - 원의 면적을 계산하여 반환 (메소드 오버라이딩)
         *
         * 클래스명: Rectangle (자식 클래스)
         * 필드: 가로(width, 실수), 세로(height, 실수)
         * 메소드: 면적 계산(calculateArea) - 사각형의 면적을 계산하여 반환 (메소드 오버라이딩)
         *
         * Shape 타입의 배열을 생성하고, Circle과 Rectangle 객체를 배열에 추가한 후, 배열을 순회하며 면적 계산 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 원의 면적: 78.54
         * 사각형의 면적: 200.0
         * */

        Shape[] shape = new Shape[2];
        shape[0] = new Circle(5);
        shape[1] = new Rectangle(40,5);

        for (Shape s : shape) {
            s.calculateArea();
        }
    }
}
