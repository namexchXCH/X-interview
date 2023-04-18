package com.xch.interview.service;

import com.xch.interview.pojo.logUser;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserService
 * @author: xiongconghui
 * @date: 2023-04-17 21:39
 **/
@Service
public interface UserService {

    Integer addUser(String PhoneNumber,String code);
    logUser findUserByPhoneNumber(String PhoneNumber);
}
