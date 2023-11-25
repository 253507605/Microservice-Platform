package com.central.user.service.Impl;

import com.central.common.model.*;
import com.central.user.service.ISysUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author Jason.Chen
 * @create 2023/11/7 11:11
 */
@Service
public class SysUserServiceImpl implements ISysUserService {
    @Override
    public LoginAppUser findByUsername(String username) {
        return null;
    }

    @Override
    public LoginAppUser findByOpenId(String openId) {
        return null;
    }

    @Override
    public LoginAppUser findByMobile(String mobile) {
        return null;
    }

    @Override
    public LoginAppUser getLoginUser(SysUser sysUser) {
        return null;
    }

    @Override
    public SysUser selectByUsername(String username) {
        return null;
    }

    @Override
    public SysUser selectByMobile(String mobile) {
        return null;
    }

    @Override
    public SysUser selectByOpenId(String openId) {
        return null;
    }

    @Override
    public void setRoleToUser(Long id, Set<Long> roles) {

    }

    @Override
    public Result updatePassword(Long id, String oldPassword, String newPassword) {
        return null;
    }

    @Override
    public PageResult<SysUser> findUsers(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<SysRole> findRolesByUserId(Long userId) {
        return null;
    }

    @Override
    public Result updateEnabled(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<SysUser> findAllUsers(Map<String, Object> params) {
        return null;
    }

    @Override
    public Result saveOrUpdateUser(SysUser sysUser) {
        return null;
    }

    @Override
    public boolean delUser(Long id) {
        return false;
    }
}
