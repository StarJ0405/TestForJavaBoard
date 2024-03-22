package com.StarJ.Members;

public class MemberController {
    public static final MemberController MEMBER_CONTROLLER = new MemberController();
    private final MemberRepository memberRepository = new MemberRepository();
    private final MemberView memberView = new MemberView();

    private MemberController() {
    }

    public void add(String id, String password, String nickname) {
        memberView.addStartMessage();
        memberRepository.add(id, password, nickname);
        memberView.addEndMessage();
    }

    public void login(String id, String password) {
        Member member = memberRepository.findById(id);
        if (member == null|| !member.getPassword().equals(password)) {
            memberView.failedLoginMessage();
            return;
        }
        memberView.comeon(member);
    }
}
