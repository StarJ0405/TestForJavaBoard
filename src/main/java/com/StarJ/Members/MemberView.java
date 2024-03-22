package com.StarJ.Members;

public class MemberView {
    public void addStartMessage() {
        System.out.println("==== 회원 가입을 진행합니다 ====");
    }

    public void addEndMessage() {
        System.out.println("==== 회원가입이 완료되었습니다 ====");
    }
    public void failedLoginMessage(){
        System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
    }

    public void comeon(Member member) {
        System.out.println(member.getNickname()+"님 환영합니다!");

    }
}
