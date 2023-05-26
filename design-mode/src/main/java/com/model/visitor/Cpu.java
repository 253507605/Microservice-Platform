package com.model.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/5/19 14:39
 */
public class Cpu extends ComputerPart{

    @Override
    public void accpet(Visitor visitor) {
        visitor.visitCpu(this);
    }
}
