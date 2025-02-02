package com.ohgiraffers.chap04_controlflow_statement.question.hard;

import java.util.Scanner;

public class Application {

    public static void main(String args[]) {


/*
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력하세요 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호를 입력하세요 : ");
        sc.nextLine();
        char operator = sc.nextLine().charAt(0);

        // switch문 사용

        int result = first + second;
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다");
                break;
        }
        System.out.println("연산출력 : " + first + operator + second + " = " + result);
*/


//        Scanner sc = new Scanner(System.in);
/*        System.out.println("과일 이름을 입력하세요 : ");
        String fruit = sc.nextLine();

        int price = 0;

        switch (fruit) {
            case "apple":
                price = 3000;
                break;
            case "banana":
                price = 4000;
                break;
            case "peach":
                price = 5000;
                break;
            case "kiwi":
                price = 6000;
                break;

            default:
                System.out.println("준비된 상품이 없습니다. ");
                break;
        }
        System.out.println(fruit + "의 가격은 " + price + "원 입니다.");*/



/*        int random = (int) (Math.random() * 100) + 1;
        System.out.println("난수 : " + random);

//        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.println("정수 확인 : " + num);

        boolean correct = false;

        int count = 0;

        while (!correct) {
            // 조건이 true 이어야 반복문이 실행됨.

//            System.out.println("정수를 입력하세요 : ");
//            int num = sc.nextInt();
            // 위의 두 줄이 while문 밖에 있으면 무한재생됨

            count++;
            System.out.println("count : " + count);

            if (num > random) {
                System.out.println("입력하신 정수보다 큽니다.");
            } else if (num < random) {
                System.out.println("입력하신 정수보다 작습니다.");
            } else {
                System.out.println(count + "회 만에 정답을 맞추셨습니다.");
                correct = true;
            }
        }*/



       /* boolean correct = false;

        while (!correct) {
            System.out.print("정수를 입력하세요 : ");
            int num = sc.nextInt();
            //-----------------------------------------------------

            if (num <= 2) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                continue;
            }
            correct = true; // <- 이거 없으면 아래 correct = false가 계속 적용됨
            // num 예시로 15, 21을 넣어보자


            // 얘가 소수판별기네
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    correct = false;
                    System.out.println("correct ----> " + correct);
                    System.out.println("num % " + i + "== 한 결과 0이므로 소수가 아니다!!");
                    break; // for문 종료
                } else {
                    System.out.println("correct====> " + correct);
                }
            }

            if (!correct) {
                System.out.println(num + " % " +"√" +num + "의 길이 까지 for문 돌렸을 때 나머지가0인 경우가 있어 소수가 아님이 판명됨!! ");
            } else {
                System.out.println("일단 나머지가 1이 있는 수임.");
            }

            break; // while문 종료*/

        Scanner sc = new Scanner(System.in);
        System.out.print(" 문자열 입력 : ");
        String input = sc.nextLine();
        // System.out.println("입력받은 문자열 출력 : " + input);

        //문자열이 영문자로만 되어 있는지 확인
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println("for문 확인 : " + ch);

            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                sc.close();
                return; // <- 없으면 for문 모두 돌아가게 된다.
                // 해당 메소드가 호출된 곳 까지 종료
                // if문을 포함한 메소드 자체를 종료
            }
        }

        // 검색할 문자 입력
        System.out.print("검색할 문자 입력 : ");
        char searchChar = sc.nextLine().charAt(0);
        // System.out.println("searchChar : " + searchChar);

        // 검색할 문자가 몇 개 있는지 확인
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == searchChar) {
                count++;
            }
        }
        System.out.println("count의 값은 : " + count);
        sc.close();

    }
}
