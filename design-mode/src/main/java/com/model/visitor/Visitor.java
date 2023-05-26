package com.model.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/5/19 14:39
 */
public interface Visitor {

    public void visitMouse(Mouse mouse);

    public void visitCpu(Cpu cpu);

    public void visitKeyBoard(KeyBoard keyBoard);
}
