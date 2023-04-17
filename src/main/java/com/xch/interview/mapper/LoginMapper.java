package com.xch.interview.mapper;

import com.xch.interview.utils.BaseResult;
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
    BaseResult passwordLogin(Map<String,Object> map);


    /**
     *用户使用验证码登录
     */
    BaseResult TextMessageLogin(Map<String,Object> map);

}
