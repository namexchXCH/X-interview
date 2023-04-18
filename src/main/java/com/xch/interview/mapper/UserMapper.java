package com.xch.interview.mapper;

import com.xch.interview.pojo.logUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ClassName: UserMapper
 * @author: xiongconghui
 * @date: 2023-04-17 21:38
 **/

@Mapper
@Component
public interface UserMapper {
    /**
     * 通过手机号来查询用户
     */
    logUser findUserByPhoneNumber(String PhoneNumber);

    /**
     * 添加用户
     */
    Integer addUser(Map<String, Object> map);
}
