package com.study.sidefunweb.controller;

import com.study.sidefunweb.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/hello")
    public void hello(Member member){

    }
}
