package com.model.iterator;

import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/6/21 10:17
 */
public class ConcreInterator implements Interator<String>{

    List<String> list;

    int i = 0;

    public ConcreInterator(List<String> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return i <= list.size()-1;
    }

    @Override
    public String next() {
        return list.get(i++);
    }

    @Override
    public void remove() {
        list.remove(i);
    }
}
