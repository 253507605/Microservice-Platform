package com.central.user.controller;

import com.central.user.config.AppConfig;
import com.jason.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Jason.Chen
 * @create 2023/4/26 10:40
 */

@RestController
@RequestMapping("/sys")
public class SysUserController {

    @Value("${jason.name}")
    private String name;

    @Autowired
    private AppConfig config;


    @GetMapping("/hello")
    public String hello(){
        System.out.println(name);
        System.out.println(config);
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
