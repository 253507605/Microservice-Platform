package com.model.prototype;

import com.model.builder.AtdPersonPaycode1;

import java.io.*;

/**
 * @Author Jason.Chen
 * @create 2023/5/11 16:40
 */
public class ConcretePrototype1 extends prototype{

    @Override
    public ConcretePrototype1 clone(){
        ConcretePrototype1 prototype = null;
        ByteArrayOutputStream bas = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bas = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bas);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bas.toByteArray());
            ois = new ObjectInputStream(bis);
            prototype = (ConcretePrototype1) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(bas != null){
                try {
                    bas.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return prototype;
    }
}
