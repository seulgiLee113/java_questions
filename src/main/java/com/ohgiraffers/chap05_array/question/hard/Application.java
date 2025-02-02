package com.ohgiraffers.chap05_array.question.hard;

import java.util.Scanner;

public class Application {

    public static void main(String args[]){

        /* Q1. 정수형 배열에 저장된 값들을 순차 정렬(오름차순)하여 출력하세요.
         *
         * -- 입력 예시 --
         * 정수 5개를 입력하세요: 5 2 3 1 4
         *
         * -- 출력 예시 --
         * 정렬된 값: 1 2 3 4 5
         * */
   /*     Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        System.out.print("정수 5개를 입력하세요 : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }


        System.out.print("정렬된 값 : ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();*/


        /* Q2. 3x3 크기의 정수형 가변 배열을 선언하고 값을 입력받아 저장한 후, 각 행의 합계를 출력하세요.
         *
         * -- 입력 예시 --
         * 배열 값을 입력하세요:
         * 1 2
         * 3 4 5
         * 6
         *
         * -- 출력 예시 --
         * 행 1의 합: 3
         * 행 2의 합: 12
         * 행 3의 합: 6
         * */

        Scanner sc = new Scanner(System.in);
        int[][] jaggedArray = new int[3][];

        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[1];

        // 배열 입력
        System.out.println("배열 값을 입력하세요 : ");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        // 배열 출력
        for (int i = 0; i < jaggedArray.length; i++) {
            int rowSum = 0;

            for (int j = 0; j < jaggedArray[i].length; j++) {
                rowSum += jaggedArray[i][j];
            }

            System.out.println("행 " + (i + 1) + "의 합 : " + rowSum);
        }

        sc.close();
    }
}
