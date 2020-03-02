package com.yiluyouni.cloud.service.impl;

import com.yiluyouni.cloud.dao.UserMapper;
import com.yiluyouni.cloud.entity.User;
import com.yiluyouni.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
