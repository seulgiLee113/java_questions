package com.ohgiraffers.chap05_array.question.basic;

import java.util.Scanner;

public class Application {

    public static void main(String args[]) {

        /* Q1. 5개의 정수를 입력받아 배열에 저장한 후, 저장된 값을 순서대로 출력하세요.
         *
         * -- 입력 예시 --
         * 정수 5개를 입력하세요: 1 2 3 4 5
         *
         * -- 출력 예시 --
         * 저장된 값: 1 2 3 4 5
         */

        /*
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        System.out.println("arr1 : " + arr1);

        // 정수 5개 입력하기
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(i + "번째 정수를 입력하세요 : ");
            arr1[i] = sc.nextInt();
            // System.out.println("출력--->" + arr1 + " ");
        }
        System.out.println("저장된 값: ");

        for (int num : arr1) {
            System.out.print(num + " ");
        }
*/

        /* Q2. 5개의 정수를 입력받아 배열에 저장한 후, 저장된 값을 거꾸로 출력하세요.
         *
         * -- 입력 예시 --
         * 정수 5개를 입력하세요: 1 2 3 4 5
         *
         * -- 출력 예시 --
         * 저장된 값 (거꾸로): 5 4 3 2 1
         * */

        Scanner sc = new Scanner(System.in);
        int[] arr2 = new int[5];

        // 정수 5개 입력하기
        System.out.print("정수 5개를 입력하세요 : ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // 저장된 값 거꾸로 출력하기
        System.out.println("저장된 값(거꾸로): ");
        // System.out.println("arr2.length : " + arr2.length);

        for (int i = arr2.length-1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }

        sc.close();

    }
}
