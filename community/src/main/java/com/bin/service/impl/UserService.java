package com.bin.service.impl;

import com.bin.bean.User;
import com.bin.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserMapper {
    @Autowired
    private UserMapper userMapper;

    //根据id查询用户所有信息
    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }
    //根据用户名查询用户所有信息
    @Override
    public User selectUserByName(String username) {
        return userMapper.selectUserByName(username);
    }
    //根据用户邮箱查询用户所有信息
    @Override
    public User selectUserByEmail(String email) {
        return userMapper.selectUserByEmail(email);
    }
    //插入一条用户数据
    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
    //根据用户id更新用户状态
    @Override
    public int updateStatus(Integer id, Integer status) {
        return userMapper.updateStatus(id, status);
    }
    //根据用户id更新用户的url
    @Override
    public int updateHeaderUrl(Integer id, String headerUrl) {
        return userMapper.updateHeaderUrl(id, headerUrl);
    }
    //根据id更新用户的密码
    @Override
    public int updatePassword(Integer id, String password) {
        return userMapper.updatePassword(id, password);
    }
}
