package com.model.strategy;

/**
 * @Author Jason.Chen
 * @create 2023/5/25 19:44
 */
public class Context {

    private strategy strategy;

    public strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(strategy strategy) {
        this.strategy = strategy;
    }

    public void toDestination(){
        strategy.transportaction();
    }
}
