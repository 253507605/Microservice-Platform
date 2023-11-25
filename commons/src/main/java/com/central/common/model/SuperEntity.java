package com.central.common.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author Jason.Chen
 * @create 2023/11/7 10:34
 */
@Getter
@Setter
public class SuperEntity {

    private Long id;

    private Date createTime;

    private Date updateTime;
}
