package com.model.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/5/19 14:39
 */
public class KeyBoard extends ComputerPart{

    private String id;

    @Override
    public void accpet(Visitor visitor) {
        visitor.visitKeyBoard(this);
    }
}
