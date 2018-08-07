package com.ly.firstrpc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ly.firstrpc.api.IUserRpcService;
import com.ly.firstrpc.api.User;

/**
 * @Description:
 * @Date 2018-08-07 14:20
 * @Author ly
 */
@Service
public class UserImpl implements IUserRpcService {
    @Override
    public void sayHello() {
        System.out.println("hello, gentleman.");
    }

    @Override
    public User getUserById(Integer userId) {
        User user = new User();
        user.setName("zhangsan"+userId);
        user.setAge(userId%10);
        user.setAddress("bj");
        return user;
    }

}
