package com.model.mediator;

/**
 * @Author Jason.Chen
 * @create 2023/6/16 13:51
 */
public class ConreteColleague2 implements Colleague{
    Mediator mediator;

    public ConreteColleague2(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public void publish(String message) {
        System.out.println("我要买房子，你们有啥门路吗？？");
        mediator.notifyOthers(this);
    }

    @Override
    public void receiveMessage() {
        System.out.println("收到");
    }
}
