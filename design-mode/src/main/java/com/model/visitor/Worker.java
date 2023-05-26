package com.model.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/5/19 14:55
 */
public class Worker implements Visitor{
    @Override
    public void visitMouse(Mouse mouse) {
        System.out.println("组装鼠标");
    }

    @Override
    public void visitCpu(Cpu cpu) {
        System.out.println("组装CPU");
    }

    @Override
    public void visitKeyBoard(KeyBoard keyBoard) {
        System.out.println("组装键盘");
    }
}
