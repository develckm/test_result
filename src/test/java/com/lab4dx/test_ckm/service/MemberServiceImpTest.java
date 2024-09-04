package com.lab4dx.test_ckm.service;

import com.lab4dx.test_ckm.dto.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MemberServiceImpTest {
    @Autowired
    MemberService memberService;
    @Test
    void login() {
        System.out.println(memberService.login("aaa", "1234"));
        System.out.println(memberService.login("aaa", "12345"));

    }
    @Test
    void checkId() {
        System.out.println(memberService.checkId("aaa"));
        System.out.println(memberService.checkId("ccc"));

    }

    @Test
    void register() {
        Member member = new Member();
        member.setId("ccc");
        member.setPw("12345");
        member.setAge(25);
        member.setName("serviceTest");
        member.setGender("female");
        member.setPhone("010-2345-6789");
        System.out.println(memberService.register(member));

    }

}