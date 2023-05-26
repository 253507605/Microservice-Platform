package com.model.strategy;

/**
 * @Author Jason.Chen
 * @create 2023/5/25 19:49
 */
public class BusFactory implements factory{
    @Override
    public strategy createStrategy() {
        return new Bus();
    }
}
