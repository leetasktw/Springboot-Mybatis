package com.leetasktw.controller;

import com.leetasktw.pojo.Member;
import com.leetasktw.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/list")
    public List<Member> queryMembers() {
        return memberService.findAll();
    }
}
