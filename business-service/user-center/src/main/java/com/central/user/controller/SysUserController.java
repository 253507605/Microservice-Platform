package com.central.user.controller;

import com.central.common.mapper.superEntityMapper;
import com.central.common.model.SuperEntity;
import com.central.user.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Autowired
    private com.central.common.mapper.superEntityMapper superEntityMapper;


    @GetMapping("/hello")
    public String hello(){
//        List<SuperEntity> allUsers = superEntityMapper.getAllUsers();
        SuperEntity users = superEntityMapper.getUserById(1);
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
