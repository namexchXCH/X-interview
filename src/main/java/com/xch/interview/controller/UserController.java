package com.xch.interview.controller;

import com.xch.interview.service.UserService;
import com.xch.interview.utils.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: UserController
 * @author: xiongconghui
 * @date: 2023-04-17 21:37
 **/
@RestController
public class UserController {
    @Resource
    private UserService userService;


   public BaseResult findUserByPhoneNumber(String PhoneNumber){

       return  null;

   }
    @GetMapping("/interview/u_islogin")
    public BaseResult findUserByUserId(@RequestParam("UserId") String UserId){

        return  userService.findUserByUserId(UserId);
    }

}
