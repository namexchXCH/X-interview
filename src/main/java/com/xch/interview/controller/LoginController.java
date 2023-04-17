package com.xch.interview.controller;

import com.xch.interview.utils.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: logController
 * @author: xiongconghui
 * @date: 2023-04-17 17:11
 **/

@RestController
public class LoginController {


    /**
     *密码登录
     */
    @PostMapping("/interview/loginp")
    public BaseResult Passwordlogin(@RequestParam("phoneNumber") String phoneNumber,@RequestParam("code")String code){
        System.out.println(phoneNumber+":"+code);
       return BaseResult.ok("接口待实现");
    }


    /**
     *短信登录
     */
    @PostMapping("/interview/logint")
    public BaseResult TextMessagelogin(@RequestParam("phoneNumber") String phoneNumber,@RequestParam("code")String code){
        System.out.println(phoneNumber+":"+code);
        return BaseResult.ok("接口待实现");
    }

}
