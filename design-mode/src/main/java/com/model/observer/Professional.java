package com.model.observer;

/**
 * @Author Jason.Chen
 * @create 2023/5/30 15:29
 */
public class Professional implements Observer{
    @Override
    public void observer() {
        System.out.println("研究一下各个游戏，职业用");
    }
}
