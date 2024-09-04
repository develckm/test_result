package com.lab4dx.test_ckm.mapper;

import com.lab4dx.test_ckm.dto.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    //회원가입,아이디중복검사,로그인
    int insert(Member member);
    Member selectById(String id);
    Member selectByIdAndPw(String id, String pw);
}
