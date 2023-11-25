package com.central.user.service;

import com.central.common.model.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author Jason.Chen
 * @create 2023/11/7 10:21
 */
public interface ISysUserService {

    LoginAppUser findByUsername(String username);

    LoginAppUser findByOpenId(String openId);

    LoginAppUser findByMobile(String mobile);

    LoginAppUser getLoginUser(SysUser sysUser);

    SysUser selectByUsername(String username);

    SysUser selectByMobile(String mobile);

    SysUser selectByOpenId(String openId);

    void setRoleToUser(Long id, Set<Long> roles);

    Result updatePassword(Long id,String oldPassword,String newPassword);

    PageResult<SysUser> findUsers(Map<String,Object> params);

    List<SysRole> findRolesByUserId(Long userId);

    Result updateEnabled(Map<String,Object> params);

    List<SysUser> findAllUsers(Map<String,Object> params);

    Result saveOrUpdateUser(SysUser sysUser);

    boolean delUser(Long id);
}
