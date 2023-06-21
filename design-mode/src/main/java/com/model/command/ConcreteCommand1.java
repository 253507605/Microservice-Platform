package com.model.command;

/**
 * @Author Jason.Chen
 * @create 2023/6/21 14:00
 */
public class ConcreteCommand1 extends Command{
    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.doSometing1();
    }
}
