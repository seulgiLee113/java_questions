package com.ohgiraffers.chap04_controlflow_statement.question.normal;

import java.util.Scanner;

public class Application {

    public static void main(String args[]) {

        /* Q1. 1~10 사이의 정수 한 개를 입력받아 홀수인지 짝수인지 확인하고,
         * 홀수이면 "홀수다.", 짝수이면 "짝수다."라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 홀수다.
         * */
        Scanner sc = new Scanner(System.in);
//        System.out.println("정수 입력하세요 : ");
//        int num = sc.nextInt();
//
//        if (num <= 1 || num >= 10) {
//            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
//        } else if (num % 2 != 0) {
//            System.out.println("홀수다. ");
//        } else System.out.println("짝수다.");



        /* Q2. BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중입니다.",
         * 정상체중(20 이상 25 미만)인 경우 "당신은 정상체중입니다.",
         * 과체중(25 이상 30 미만)인 경우 "당신은 과체중입니다.",
         * 비만(30 이상)인 경우 "당신은 비만입니다."를 출력하세요.
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 입니다.
         *
         * -- 입력 예시 --
         * 체중(kg)을 입력하세요: 67
         * 신장(m)을 입력하세요: 1.7
         *
         * -- 출력 예시 --
         * 당신은 정상체중입니다.
         * */

        System.out.println("체중을 입력하세요");
        int kg = sc.nextInt();
        System.out.println("신장을 입력하세요");
        double m = sc.nextInt();

        int bmi = (int) (kg / (m * m));

        if (bmi < 20) {
            System.out.println("저체중");
        } else if (bmi < 25) {
            System.out.println("정상체중");
        } else if (bmi < 30) {
            System.out.println("과체중");
        } else
            System.out.println("비만");



        /* Q3. 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요.
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : apple
         *
         * -- 출력 예시 --
         * 0 : a
         * 1 : p
         * 2 : p
         * 3 : l
         * 4 : e
         * */

        System.out.println("문자열을 입력하세요");
        String str = sc.nextLine();
        System.out.println("입력받은 문자열 확인: " + str);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + " : " + str.charAt(i));
        }


        /* Q4. 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "수", 짝수이면 "박"이 정수만큼 누적되어 출력되게 작성하시오.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 수박수박수
         * */

        System.out.println("정수를 입력하세요");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 0 != 0) {
                System.out.println("수");
            } else
                System.out.println("박");
        }

        sc.close();
    }


}
