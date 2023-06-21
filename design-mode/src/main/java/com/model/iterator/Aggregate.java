package com.model.iterator;

/**
 * @Author Jason.Chen
 * @create 2023/6/21 10:10
 */
public interface Aggregate<T> {

    public void add(String str);

    public Interator interator();
}
