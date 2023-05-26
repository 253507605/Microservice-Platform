package com.model.factoryMethod;

/**
 * @Author Jason.Chen
 * @create 2023/5/5 15:43
 */
public class Huawei implements Phone{
    @Override
    public void make() {
        System.out.println("生产华为手机");
    }
}
