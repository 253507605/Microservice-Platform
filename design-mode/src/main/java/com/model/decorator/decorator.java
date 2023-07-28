package com.model.decorator;

/**
 * @Author Jason.Chen
 * @create 2023/6/29 16:45
 */
public abstract class decorator implements Component{

    private Component component;

    public decorator(Component component){
        this.component = component;
    }


    @Override
    public void operation1() {
        component.operation1();
    }

    @Override
    public void operation2() {
        component.operation2();
    }
}
