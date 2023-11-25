package com.central.user;

import com.central.user.config.AppConfig;
import com.central.user.controller.SysUserController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @Author Jason.Chen
 * @create 2023/4/26 10:18
 */

@SpringBootApplication
@MapperScan("com.central.common.mapper")
public class UserCenterApp {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApp.class,args);
    }

    public UserCenterApp(){
        System.out.println("初始化");
    }
}
