package com.model.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/6/9 14:19
 */
public class Caretaker {

    List<Memento> mementos = new ArrayList<>();

    int count = 0;

    public void add(Memento memento){
        mementos.add(memento);
        count++;
    }

    public Memento getMemento(int index){
        return mementos.remove(index);
    }
}
