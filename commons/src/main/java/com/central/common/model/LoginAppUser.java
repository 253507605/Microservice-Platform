package com.central.common.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @Author Jason.Chen
 * @create 2023/11/7 10:33
 */
@Getter
@Setter
public class LoginAppUser extends SysUser{

    private Set<String> permissions;


}
