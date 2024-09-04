package com.lab4dx.test_ckm.service;

import com.lab4dx.test_ckm.dto.Member;
import com.lab4dx.test_ckm.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImp implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public Member login(String id, String pw) {
        return memberMapper.selectByIdAndPw(id, pw);
    }

    @Override
    public boolean register(Member member) {
        boolean register=false;
        if(memberMapper.insert(member)>0){
            register=true;
        }
        return register;
    }

    @Override
    public boolean checkId(String id) {
        boolean checkId=false;
        if(memberMapper.selectById(id)==null){
            checkId=true;
        }
        return checkId;
    }
}
