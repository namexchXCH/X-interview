package com.xch.interview.service.Impl;

import com.xch.interview.mapper.LoginMapper;
import com.xch.interview.service.LoginService;
import com.xch.interview.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: LoginServiceImpl
 * @author: xiongconghui
 * @date: 2023-04-17 20:41
 **/
@Service
public class LoginServiceImpl implements LoginService {
   @Autowired
   private LoginMapper loginMapper;

    @Override
    public BaseResult passwordLogin(String phoneNumber, String password) {

        return null;
    }

    @Override
    public BaseResult TextMessageLogin(String phoneNumber, String code) {
        return null;
    }
}
