package com.model.command;

/**
 * @Author Jason.Chen
 * @create 2023/6/21 13:55
 */
public abstract class Command {

    public Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void execute();
}
