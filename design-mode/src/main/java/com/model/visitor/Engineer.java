package com.model.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/5/19 14:54
 */
public class Engineer implements Visitor{
    @Override
    public void visitMouse(Mouse mouse) {
        System.out.println("给鼠标设计程序");
    }

    @Override
    public void visitCpu(Cpu cpu) {
        System.out.println("给CPU设计程序");
    }

    @Override
    public void visitKeyBoard(KeyBoard keyBoard) {
        System.out.println("给键盘设计程序");
    }
}
