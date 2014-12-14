package com.guobin.myweb.service.impl;

import com.guobin.myweb.bean.UserBean;
import com.guobin.myweb.dao.UserMapper;
import com.guobin.myweb.service.FooService;
import org.springframework.stereotype.Service;

/**
 * Created by withnate on 14-12-14.
 */
@Service
public class FooServiceImpl implements FooService{

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserBean doSomeBusinessStuff(String userId) {
        return this.userMapper.getUser(userId);
    }
}
