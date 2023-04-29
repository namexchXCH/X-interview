package com.xch.interview.controller;

import com.xch.interview.service.LoginService;
import com.xch.interview.utils.BaseResult;
import com.xch.interview.utils.tokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: logController
 * @author: xiongconghui
 * @date: 2023-04-17 17:11
 **/

@RestController
public class LoginController {

    @Autowired
   private LoginService loginServiceImpl;

    /**
     *密码登录
     */
    @PostMapping("/interview/loginp")
    public BaseResult Passwordlogin(@RequestParam("phoneNumber") String phoneNumber, @RequestParam("code")String code, HttpServletResponse  response ){
       if (phoneNumber!=null){
           response.setHeader("Authoriz", tokenUtil.sign(phoneNumber));
         }
        return loginServiceImpl.passwordLogin(phoneNumber, code);
    }


    /**
     *短信登录
     */
    @PostMapping("/interview/logint")
    public BaseResult TextMessagelogin(@RequestParam("phoneNumber") String phoneNumber,@RequestParam("code")String code){

        return loginServiceImpl.TextMessageLogin(phoneNumber,code);
    }

    /**
     * 获取手机验证码
     */
    @GetMapping("/interview/getcode")
    public BaseResult SendCdoe(){
        return BaseResult.ok("功能待开发");
    }

    /**
     * 注册账号
     */

    @PostMapping("/interview/register")
    public BaseResult RegisterAccount(@RequestParam("phoneNumber") String phoneNumber,@RequestParam("password") String password){
        return loginServiceImpl.RegisterAccount(phoneNumber,password);
    }

}
