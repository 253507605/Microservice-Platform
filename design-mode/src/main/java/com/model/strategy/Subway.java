package com.model.strategy;

/**
 * @Author Jason.Chen
 * @create 2023/5/25 19:42
 */
public class Subway implements strategy{
    @Override
    public void transportaction() {
        System.out.println("乘坐地铁的方式");
    }
}
