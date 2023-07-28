package com.model.decorator;

import java.util.Comparator;

/**
 * @Author Jason.Chen
 * @create 2023/6/29 16:42
 */
public class ConcreteComponent implements Component{

    @Override
    public void operation1() {
        System.out.println("处理业务1");
    }

    @Override
    public void operation2() {
        System.out.println("处理业务2");
    }
}
