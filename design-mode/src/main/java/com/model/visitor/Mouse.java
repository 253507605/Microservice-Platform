package com.model.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/5/19 14:39
 */
public class Mouse extends ComputerPart{
    @Override
    public void accpet(Visitor visitor) {
        visitor.visitMouse(this);
    }
}
