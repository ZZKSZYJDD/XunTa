package com.zut.DIUDIU.Control;

import com.zut.DIUDIU.Dao.Users;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
public class IndexController {
    @RequestMapping("/")
    public String hello() {
        return "main.html";
    }



    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("users");
        return "/main";
    }
    @RequestMapping("/login")
    public String loginUrl(){

        return "/login";
    }
    @RequestMapping("/register")
    public String register(){

        return "/register";
    }
}
