package com.central.common.model;

import lombok.Data;

import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/11/7 10:34
 */
@Data
public class SysUser extends SuperEntity{

    private String username;
    private String password;
    private String nickname;
    private String headImgUrl;
    private String mobile;
    private Integer sex;
    private Boolean enabled;
    private String openId;
    private boolean isDel;
    private List<SysRole> roles;
    private String roleId;
    private String oldPassword;
    private String newPassword;
}
