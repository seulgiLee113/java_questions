package com.ohgiraffers.chap05_array.question.normal;

import java.util.Scanner;

public class Application {

    public static void main(String args[]) {

        /* Q1. 2x3 크기의 정수형 정변 배열을 선언하고, 사용자로부터 값을 입력받아 저장한 후 출력하세요.
         *
         * -- 입력 예시 --
         * 배열 값을 입력하세요:
         * 1 2 3
         * 4 5 6
         *
         * -- 출력 예시 --
         * 배열의 값:
         * 1 2 3
         * 4 5 6
         * */
/*

        int[][] array = new int[2][3];

        Scanner sc = new Scanner(System.in);

        // System.out.print("값 입력 : ");
        System.out.println("배열 길이 확인 : " + array.length); // 2
        // 행의 길이는 행의 개수와 같다. 그래서 array.length의 결과는 2
        // System.out.println("array[1] : " + array[1]); // 주소값 들어가 있음
        // 배열 길이가 왜 2? 행의 개수!!

        System.out.println("배열 값을 입력하세요:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }

        }
        System.out.println("들어온 값 확인 : " + array);  // [[I@27d6c5e0
        // array에 값이 바로 들어가는 것이 아니라 주소값이 들어감


        System.out.println("배열의 값:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                // sout으로 출력해야 내가 원하는 값을 볼 수 있음
            }
            System.out.println(); // 한 줄 띄우기
        }
*/

        /* Q2. 2개의 정수형 배열을 선언하고, 얕은 복사를 수행한 후 배열의 내용을 출력하세요.
         *
         * -- 입력 예시 --
         * 첫 번째 배열 값을 입력하세요: 1 2 3
         * 두 번째 배열 값 (복사 후): 1 2 3
         * */

        int[] array2 = new int[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 배열 값을 입력하세요");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        System.out.println("array2? : " + array2);

        int[] copy = array2; // 얕은 복사

        System.out.println("얕은 복사 한 copy : " + copy);
        // array2와 동일한 주소값을 가지고 있다!
        System.out.println("결과 -----");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

        sc.close();
    }
}
