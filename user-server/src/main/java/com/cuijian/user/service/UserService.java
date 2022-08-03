package com.cuijian.user.service;

import com.cuijian.user.entity.User;
import com.cuijian.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
