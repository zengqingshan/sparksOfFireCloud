package com.yiluyouni.cloud.dao;

import com.yiluyouni.cloud.entity.User;
import org.springframework.stereotype.Component;

@Component(value = "userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}