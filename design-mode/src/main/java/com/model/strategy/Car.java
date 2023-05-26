package com.model.strategy;

/**
 * @Author Jason.Chen
 * @create 2023/5/25 19:42
 */
public class Car implements strategy{
    @Override
    public void transportaction() {
        System.out.println("打车的方式");
    }
}
