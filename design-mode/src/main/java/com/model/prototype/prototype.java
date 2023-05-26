package com.model.prototype;

import com.model.builder.AtdPersonPaycode;
import com.model.builder.AtdPersonPaycode1;

import java.io.Serializable;

/**
 * @Author Jason.Chen
 * @create 2023/5/11 16:39
 */
public class prototype implements Cloneable, Serializable {

    private String id;

    private String name;

    private String email;

    private AtdPersonPaycode atdPersonPaycode;

    private AtdPersonPaycode1 atdPersonPaycode1;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AtdPersonPaycode getAtdPersonPaycode() {
        return atdPersonPaycode;
    }

    public void setAtdPersonPaycode(AtdPersonPaycode atdPersonPaycode) {
        this.atdPersonPaycode = atdPersonPaycode;
    }

    public AtdPersonPaycode1 getAtdPersonPaycode1() {
        return atdPersonPaycode1;
    }

    public void setAtdPersonPaycode1(AtdPersonPaycode1 atdPersonPaycode1) {
        this.atdPersonPaycode1 = atdPersonPaycode1;
    }

    @Override
    public prototype clone(){
        prototype prototype = null;
        try {
            prototype = (com.model.prototype.prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
