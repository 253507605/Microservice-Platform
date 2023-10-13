package com.central.user.config;

import com.central.user.UserCenterApp;
import com.central.user.controller.SysUserController;
import com.central.user.model.SysRoleMenu;
import com.central.user.model.SysRoleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * @Author Jason.Chen
 * @create 2023/6/12 16:10
 */
@Service
@Import(SysRoleMenu.class)
public class AppConfig {

    @Autowired
    private SysUserController userController;
    @Value("${jason.name}")
    private String a;


    public AppConfig(){
        System.out.println("实例化");
    }

    @Bean
    public SysRoleUser sysRoleUser(){
        return new SysRoleUser();
    }
}
