package com.lab4dx.test_ckm.service;

import com.lab4dx.test_ckm.dto.Member;

public interface MemberService {
    Member login(String id, String pw);
    boolean register(Member member);
    boolean checkId(String id);
}
