package com.central.user.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @Author Jason.Chen
 * @create 2023/9/11 17:58
 */
@Service
public class CustomLinstner implements ApplicationListener{
    @Override
    public void onApplicationEvent(ApplicationEvent event) {

    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("前置处理："+bean.toString());
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理："+bean.toString());
        return bean;
    }
}
