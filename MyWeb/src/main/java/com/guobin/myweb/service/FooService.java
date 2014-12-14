package com.guobin.myweb.service;

import com.guobin.myweb.bean.UserBean;
import com.guobin.myweb.dao.UserMapper;

/**
 * Created by withnate on 14-12-14.
 */
public interface FooService {
    public UserBean doSomeBusinessStuff(String userId);
}
