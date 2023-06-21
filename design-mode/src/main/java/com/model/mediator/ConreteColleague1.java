package com.model.mediator;

/**
 * @Author Jason.Chen
 * @create 2023/6/16 13:50
 */
public class ConreteColleague1 implements Colleague{
    Mediator mediator;

    public ConreteColleague1(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public void publish(String message) {
        System.out.println("我这边有房子，谁要买房子啊？？？");
        mediator.notifyOthers(this);
    }

    @Override
    public void receiveMessage() {
        System.out.println("收到");
    }
}
