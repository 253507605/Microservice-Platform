package com.model.prototype;

import com.model.builder.AtdPersonPaycode1;

/**
 * @Author Jason.Chen
 * @create 2023/5/11 16:40
 */
public class ConcretePrototype extends prototype{

    @Override
    public ConcretePrototype clone(){
        ConcretePrototype prototype = null;
        prototype = (ConcretePrototype) super.clone();
        try {
            AtdPersonPaycode1 atdPersonPaycode1 = (AtdPersonPaycode1) prototype.getAtdPersonPaycode1().clone();
            prototype.setAtdPersonPaycode1(atdPersonPaycode1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
