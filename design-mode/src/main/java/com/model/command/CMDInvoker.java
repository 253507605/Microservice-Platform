package com.model.command;

/**
 * @Author Jason.Chen
 * @create 2023/6/21 13:55
 */
public class CMDInvoker {

    private Command command;

    public CMDInvoker(Command command){
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
