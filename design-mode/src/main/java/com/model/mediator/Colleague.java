package com.model.mediator;

/**
 * @Author Jason.Chen
 * @create 2023/6/16 13:48
 */
public interface Colleague {

    public void publish(String message);

    public void receiveMessage();
}
