package com.model.observer;

/**
 * @Author Jason.Chen
 * @create 2023/5/30 15:26
 */
public class Stranger implements Observer{
    @Override
    public void observer() {
        System.out.println("随便看看");
    }
}
