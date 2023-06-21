package com.model.iterator;

/**
 * @Author Jason.Chen
 * @create 2023/6/21 10:11
 */
public interface Interator<T> {

    public boolean hasNext();

    public T next();

    public void remove();
}
