package com.lab4dx.test_ckm.mapper;

import com.lab4dx.test_ckm.dto.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MemberMapperTest {
    @Autowired
    MemberMapper mapper;
    @Test
    void insert() {
        Member member = new Member();
        member.setId("bbb");
        member.setPw("12345");
        member.setAge(20);
        member.setName("test");
        member.setGender("male");
        member.setPhone("010-1234-5678");
        int insert=mapper.insert(member);
        System.out.println(insert);
    }

    @Test
    void selectById() {
        System.out.println(mapper.selectById("bbb"));
    }

    @Test
    void selectByIdAndPw() {
        System.out.println(mapper.selectByIdAndPw("bbb","12345"));
    }
}