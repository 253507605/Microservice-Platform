package com.model.responsibilityChain;

import com.model.mediator.ConreteColleague1;

/**
 * @Author Jason.Chen
 * @create 2023/6/21 17:31
 */
public class ConcreteHandler1 extends AbstractHanlder{

    private Integer type;

    public ConcreteHandler1(){
        type = 1;
    }

    @Override
    public void handle(Integer type) {
        if(type == this.type){
            System.out.println("handler1处理请求");
        } else {
            nextHandler.handle(type);
        }
    }
}
