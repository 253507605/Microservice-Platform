package com.model.decorator;

/**
 * @Author Jason.Chen
 * @create 2023/6/29 16:46
 */
public class ConcreteDecorator extends decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation1() {
        System.out.println("业务1之前装饰");
        super.operation1();
    }

    @Override
    public void operation2() {
        super.operation2();
        System.out.println("业务2之后装饰");
    }
}
