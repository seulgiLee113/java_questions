package com.ohgiraffers.chap07_objectarray.question.hard;

import java.util.Scanner;

public class MemberService {

    // 회원 등록하는 메서드
    public void signUpMembers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명의 회원을 등록하시겠습니까?");
        int num = sc.nextInt();

        Member[] members = new Member[num];

        // for문 돌려서 원하는 회원 수 만큼 회원등록하기
        for (int i = 0; i < num; i++) {
            System.out.print("번호 : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("아이디 : ");
            String userId = sc.nextLine();

            System.out.print("비밀번호 : ");
            String pwd = sc.nextLine();

            System.out.print("이름 : ");
            String name = sc.nextLine();

            System.out.print("나이 : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("성별(M/F) : ");
            char gender = sc.nextLine().charAt(0);

            // members 배열에 순서대로 회원정보 삽입
            members[i] = new Member(id, userId, pwd, name, age, gender);
        }

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);
    }
}
