package com.model.responsibilityChain;

/**
 * @Author Jason.Chen
 * @create 2023/6/21 17:29
 */
public abstract class AbstractHanlder {

    public AbstractHanlder nextHandler;

    public AbstractHanlder getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHanlder nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Integer type);
}
