package com.ohgiraffers.chap07_objectarray.question.hard;

public class MemberRepository {

    private final static Member[] members = new Member[10];
    private static int count;

    public static boolean store(Member[] newMembers) {
        if (count + newMembers.length > 10) {
            System.out.println("[store] Warning 회원 수가 초과되었습니다.");
            return false;
        }

        for (Member m : newMembers) {
            members[count++] = m;
        }

        return true;
    }

    public static Member[] findAllMembers() {
        return members;
    }
}
