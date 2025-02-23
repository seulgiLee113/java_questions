package com.ohgiraffers.chap07_objectarray.question.hard;

public class MemberRegister {

    public void regist(Member[] members) {
        System.out.println("[regist] 회원을 등록합니다.");

        // members 배열 안에 있는 각 요소들 중에서 name만 골라와서 각각 메시지 출력하기
        for (Member m : members) {
            System.out.println(m.getName() + "님을 회원 등록에 성공했습니다.");
        }

        // 왜 newMembers 가 아니고 members 이지?
        // 멤버서장소의 store 메서드에 members 배열이 존재한다면 배열길이수=회원수 이용해 메시지 출력
        if (MemberRepository.store(members)) {
            System.out.println("총 " + members.length + "명의 회원 등록에 성공했습니다.");
        }
    }
}
