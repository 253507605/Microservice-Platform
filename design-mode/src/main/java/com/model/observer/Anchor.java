package com.model.observer;

/**
 * @Author Jason.Chen
 * @create 2023/5/30 15:29
 */
public class Anchor implements Observer{
    @Override
    public void observer() {
        System.out.println("今晚直播游戏");
    }
}
