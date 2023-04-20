package com.xch.interview.mapper;

import com.xch.interview.pojo.logUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ClassName: LoginMapper
 * @author: xiongconghui
 * @date: 2023-04-17 20:42
 **/
@Mapper
@Component
public interface LoginMapper {


    /**
     *用户使用密码登录
     */
    logUser passwordLogin(Map<String,Object> map);


    /**
     *用户使用验证码登录
     */
    logUser TextMessageLogin(Map<String,Object> map);

    /**
     * 注册账号
     */

   Integer RegisterAccount(Map<String,Object> map);




}
