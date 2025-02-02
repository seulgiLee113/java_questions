package com.ohgiraffers.chap07_objectarray.question.basic;

public class Application {

    public static void main(String[] args) {

        /* Q1. 다음 조건에 맞는 클래스를 작성하고, 객체 배열을 생성하여 출력하세요.
         *
         * 복습 포인트:
         * - 객체 배열의 개념을 이해하고 설명할 수 있다.
         * - 객체 배열을 활용하여 여러 객체를 관리할 수 있다.
         *
         * 클래스명: Student
         * 필드: 이름(name, 문자열), 점수(score, 정수)
         *
         * 객체 배열 생성: 크기가 3인 Student 배열을 생성하고,
         * 각각의 객체는 "학생1", 90, "학생2", 80, "학생3", 70의 값을 가짐
         *
         * 출력 예시:
         * 이름: 학생1, 점수: 90
         * 이름: 학생2, 점수: 80
         * 이름: 학생3, 점수: 70
         * */
/*

        Student[] student = new Student[3];

        // Student 클래스에서 생성자를 만들어야 함..
        student[0] = new Student("학생1", 90);
        student[1] = new Student("학생2", 80);
        student[2] = new Student("학생3", 70);

        for (int i = 0; i < student.length; i++) {
            student[i].printStudent();
            // System.out.println("이름 : " + student.name + "점수 : " + student.score);
            // 위에걸로 못씀. name과 score를 불러올 수 x
        }

        //----------답안
        for (Student st : student) {
            System.out.println("이름: " + st.name + ", 점수: " + st.score);
        }
*/


        /* Q2. 다음 조건에 맞는 클래스를 작성하고, 객체 배열을 생성하여 총점을 출력하세요.
         *
         * 복습 포인트:
         * - 객체 배열의 개념을 이해하고 설명할 수 있다.
         * - 객체 배열을 활용하여 여러 객체를 관리할 수 있다.
         *
         * 클래스명: Product
         * 필드: 이름(name, 문자열), 가격(price, 정수)
         *
         * 객체 배열 생성: 크기가 3인 Product 배열을 생성하고,
         * 각각의 객체는 "상품1", 1000, "상품2", 2000, "상품3", 3000의 값을 가짐
         *
         * 총 가격을 계산하여 출력
         *
         * 출력 예시:
         * 총 가격: 6000
         * */

        Product[] products = new Product[3];

        products[0] = new Product("상품1", 1000);
        products[1] = new Product("상품2", 2000);
        products[2] = new Product("상품3", 3000);

        int sum = 0;
//        for (int i = 0; i < products.length; i++) {
//            sum += products[i].price;
//        }
        // --------답
        for (Product product : products) {
            sum += product.price;
        }
        //----------------------
        System.out.println("총 가격 : " + sum);


    }

}
