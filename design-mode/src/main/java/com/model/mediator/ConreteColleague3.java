package com.model.mediator;

/**
 * @Author Jason.Chen
 * @create 2023/6/16 13:51
 */
public class ConreteColleague3 implements Colleague{
    Mediator mediator;

    public ConreteColleague3(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public void publish(String message) {
        System.out.println("我是个路人，我只是随便看看");
        mediator.notifyOthers(this);
    }

    @Override
    public void receiveMessage() {
        System.out.println("收到");
    }
}
