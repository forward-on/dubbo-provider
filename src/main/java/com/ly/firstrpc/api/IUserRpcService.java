package com.ly.firstrpc.api;

/**
 * @Description:
 * @Date 2018-08-07 14:16
 * @Author ly
 */
public interface IUserRpcService {

    void sayHello();

    User getUserById(Integer userId);

}
