package com.springcloud.spring.session.redis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("msg","Hello");
        return "OK";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        System.out.println(123);
        return (String)session.getAttribute("msg");
    }

    @GetMapping("/find")
    public String findSession(){
        return "find";
    }
}
