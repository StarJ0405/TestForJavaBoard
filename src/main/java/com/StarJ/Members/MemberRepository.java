package com.StarJ.Members;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private final List<Member> list = new ArrayList<>();

    public void add(String id, String password, String nickname) {
        list.add(new Member(id, password, nickname));
    }

    public Member findById(String id) {
        for (Member member : list)
            if (member.getId().equals(id))
                return member;
        return null;
    }
}
