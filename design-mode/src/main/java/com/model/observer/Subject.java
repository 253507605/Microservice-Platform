package com.model.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/5/30 14:57
 */
public abstract class Subject {

    List<Observer> observers = new ArrayList<>();


    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void publish(){
        observers.stream().forEach(observer -> observer.observer());
    }
}
