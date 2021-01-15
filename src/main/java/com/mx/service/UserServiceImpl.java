package com.mx.service;

import com.mx.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @PostConstruct
    public void init() {
        System.out.println("init UserImpl.");
    }

    public String getName(long id) {
        return userMapper.get(id).getName();
    }
}
