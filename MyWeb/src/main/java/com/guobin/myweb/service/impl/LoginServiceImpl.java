package com.guobin.myweb.service.impl;

import com.guobin.myweb.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * Created by withnate on 14-12-13.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public String isLogin() {
        return "ok";
    }
}
