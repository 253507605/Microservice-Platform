package com.model.responsibilityChain;

/**
 * @Author Jason.Chen
 * @create 2023/6/21 17:31
 */
public class ConcreteHandler3 extends AbstractHanlder{

    private Integer type;

    public ConcreteHandler3(){
        type = 3;
    }

    @Override
    public void handle(Integer type) {
        if(type == this.type){
            System.out.println("handler3处理请求");
        } else {
            nextHandler.handle(type);
        }
    }
}
