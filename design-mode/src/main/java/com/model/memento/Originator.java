package com.model.memento;

/**
 * @Author Jason.Chen
 * @create 2023/6/9 14:19
 */
public class Originator {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Memento saveMemento(){
        Memento memento = new Memento();
        memento.setStatus(status);
        return memento;
    }

    public  void getStatusFromMemento(Memento memento){
        status = memento.getStatus();
    }
}
