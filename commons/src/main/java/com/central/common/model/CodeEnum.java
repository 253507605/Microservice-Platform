package com.central.common.model;

/**
 * @Author Jason.Chen
 * @create 2023/11/7 11:03
 */
public enum  CodeEnum {

    SUCCESS(1),
    ERROR(0);

    private Integer code;

    CodeEnum(Integer code){
        this.code = code;
    }
    public Integer getCode(){
        return code;
    }
}
