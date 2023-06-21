package com.model.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/6/16 13:52
 */
public class ConcreteMediator implements Mediator{

    List<Colleague> list = new ArrayList<>();

    @Override
    public void addColleague(Colleague colleague) {
        list.add(colleague);
    }

    @Override
    public void notifyOthers(Colleague colleague) {

        list.stream().forEach(colleague1 -> {
            if(!colleague1.equals(colleague)){
                colleague1.receiveMessage();
            }
        });
    }
}
