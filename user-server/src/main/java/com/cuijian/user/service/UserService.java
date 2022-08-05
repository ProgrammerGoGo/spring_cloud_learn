package com.cuijian.user.service;

import com.cuijian.user.entity.User;
import com.cuijian.user.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long id) {
        log.info("UserService#getUserById id:{}", id);
        return userMapper.getUserById(id);
    }
}
