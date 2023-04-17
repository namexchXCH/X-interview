package com.xch.interview.service;

import com.xch.interview.utils.BaseResult;

/**
 * @ClassName: LoginService
 * @author: xiongconghui
 * @date: 2023-04-17 20:34
 **/
public interface LoginService {
    /**
     *用户使用密码登录
     */
    BaseResult passwordLogin(String phoneNumber,String password);


    /**
     *用户使用验证码登录
     */
    BaseResult TextMessageLogin(String phoneNumber,String code);

}
