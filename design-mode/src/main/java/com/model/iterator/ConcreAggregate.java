package com.model.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/6/21 10:14
 */
public class ConcreAggregate implements Aggregate<String>{

    List<String> list = new ArrayList<>();

    @Override
    public void add(String str) {
        list.add(str);
    }

    @Override
    public Interator interator() {
        return new ConcreInterator(list);
    }
}
