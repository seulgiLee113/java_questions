package com.ohgiraffers.chap07_objectarray.question.hard;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MemberService memberService = new MemberService();

        while(true) {
            System.out.println("======== 회원 관리 프로그램 ========");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("3. 조건에 따른 회원 조회");
            System.out.println("4. 평균 나이 및 성별 통계");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            int no = sc.nextInt();

            switch (no) {
                case 1 : memberService.signUpMembers(); break;
//                case 2 : memberService.showAllMembers(); break;
//                case 3 : memberService.filterMembers(); break;
//                case 4 : memberService.showStatistics(); break;
                case 9 : System.out.println("프로그램을 종료합니다."); return;
                default: System.out.println("잘못된 번호를 입력하셨습니다."); break;
            }
        }
    }
}
