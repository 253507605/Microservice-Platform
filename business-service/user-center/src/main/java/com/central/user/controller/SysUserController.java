package com.central.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Jason.Chen
 * @create 2023/4/26 10:40
 */

@Controller
@RequestMapping("/sys")
public class SysUserController {


    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    private String login(String username,String password){
        System.out.println(username);
        System.out.println(password);
        return "login";
    }
}
