package com.model.command;

/**
 * @Author Jason.Chen
 * @create 2023/6/21 13:58
 */
public class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.doSometing();
    }
}
