package com.xujd.service;

import com.xujd.model.UserInfo;

import java.util.List;

public interface UserInfoService {
    /**
     *添加用户信息
     * @param user
     */
    void insertUser(UserInfo user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(int id);

    /**
     * 修改用户信息
     * @param user
     */
    void updateUser(UserInfo user);
    /**
     * 根据ID获取用户信息
     * @param id
     * @return
     */
    UserInfo selectUserById(int id);
    /**
     * 获取所有用户信息
     * @return
     */
    List<UserInfo> selectAll();
    /**
     * 根据登入名获取用户
     * @param
     * @return
     */
    UserInfo selectUserByLoginName(String loginName);

    /**
     * 根据查询条件获取用户
     * @param userInfo
     * @return
     */
    List<UserInfo> selectUserByParams(UserInfo userInfo);

    /**
     * 获取所有用户数量
     * @return
     */
    int selectUserCount();
}
