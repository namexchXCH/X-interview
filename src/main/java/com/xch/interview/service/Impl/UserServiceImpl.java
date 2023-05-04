package com.xch.interview.service.Impl;

import com.xch.interview.mapper.UserMapper;
import com.xch.interview.pojo.logUser;
import com.xch.interview.service.UserService;
import com.xch.interview.utils.BaseResult;
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
    public BaseResult findUserByPhoneNumber(String PhoneNumber) {
        logUser user = userMapper.findUserByPhoneNumber(PhoneNumber);
        return BaseResult.ok("成功",user);
    }

    @Override
    public BaseResult findUserByUserId(String UserId) {

        logUser user = userMapper.findUserByUserId(UserId);
        if (user==null){
           return BaseResult.fail("用户不存在");
        }
        return BaseResult.ok("成功",user);
    }


}
