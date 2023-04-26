package com.central.user.model;

/**
 * @Author Jason.Chen
 * @create 2023/4/26 10:20
 */
public class SysRoleUser {

    private Long userId;

    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
