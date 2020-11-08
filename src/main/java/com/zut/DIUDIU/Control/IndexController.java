package com.zut.DIUDIU.Control;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    @RequestMapping("/")
    public String hello() {
        return "main.html";
    }
}
