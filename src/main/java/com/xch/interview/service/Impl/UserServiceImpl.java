package com.xch.interview.service.Impl;

import com.xch.interview.mapper.UserMapper;
import com.xch.interview.pojo.logUser;
import com.xch.interview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @author: xiongconghui
 * @date: 2023-04-17 21:39
 **/

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 用户注册
     */
    @Override
    public Integer addUser(String PhoneNumber, String code) {

        return null;
    }

    /**
     * 手机号查找用户
     */

    @Override
    public logUser findUserByPhoneNumber(String PhoneNumber) {

        return userMapper.findUserByPhoneNumber(PhoneNumber);
    }


}
