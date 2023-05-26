package com.model.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/5/19 14:39
 */
public class Computer{

    private List<ComputerPart> computerPartList;

    public Computer(){
        computerPartList = new ArrayList<>();
    }

    public void addComputerPart(ComputerPart part){
        computerPartList.add(part);
    }

    public void removeComputerPard(ComputerPart part){
        computerPartList.remove(part);
    }

    public void accpet(Visitor visitor){
        for(ComputerPart computerPart : computerPartList){
            computerPart.accpet(visitor);
        }
    }
}
