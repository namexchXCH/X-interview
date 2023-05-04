package com.xch.interview.service.Impl;

import com.xch.interview.mapper.LoginMapper;
import com.xch.interview.mapper.UserMapper;
import com.xch.interview.pojo.logUser;
import com.xch.interview.service.LoginService;
import com.xch.interview.utils.BaseResult;
import com.xch.interview.utils.RandomName;
import com.xch.interview.utils.SnowFlakeGenerateIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: LoginServiceImpl
 * @author: xiongconghui
 * @date: 2023-04-17 20:41
 **/
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private LoginMapper loginMapper;

   @Autowired
   private UserMapper userMapper;

    /**
     * 密码登录
     */
    @Override
    public BaseResult passwordLogin(String phoneNumber, String password) {

        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("phoneNumber",phoneNumber);
        stringObjectHashMap.put("password",password);
        logUser logUser1 = userMapper.findUserByPhoneNumber(phoneNumber);
        logUser user = loginMapper.passwordLogin(stringObjectHashMap);

        if (logUser1==null){
            return BaseResult.fail("用户不存在，请先注册");
        }

        if (user==null){
            return BaseResult.fail("密码错误");
        }

        return BaseResult.ok("登录成功",user);
    }


    /**
     * 验证码登录如果没有账号先自动注册再登录
     */
    @Override
    public BaseResult TextMessageLogin(String phoneNumber, String code) {
        String stringCode = stringRedisTemplate.opsForValue().get(phoneNumber);
        if (stringCode==null || !stringCode.equals(code)){
            return BaseResult.fail("验证码错误或过期");
        }

        String trim = phoneNumber.trim();
        logUser user = userMapper.findUserByPhoneNumber(phoneNumber);
        String substring = trim.substring(trim.length() - 4, trim.length())+"cH";
        if (user == null) {
            /**
             * 没有此用户，先注册用户
             *
             * 发送短信还没做
             */

            HashMap<String, Object> stringStringHashMap = new HashMap<String, Object>();
            SnowFlakeGenerateIdWorker snowFlakeGenerateIdWorker = new SnowFlakeGenerateIdWorker(0L,0L);
            String id = snowFlakeGenerateIdWorker.generateNextId();
            stringStringHashMap.put("phoneNumber",trim);
            stringStringHashMap.put("password",substring);
            stringStringHashMap.put("userId",id);
            Integer integer = userMapper.addUser(stringStringHashMap);
            if (integer <= 0){
                return BaseResult.fail("登录注册失败");
            }
        }

        logUser loguser = new logUser();
        loguser.setPhone_number(phoneNumber);
        loguser.setPassword(substring);

        return BaseResult.ok("登录成功",loguser);

    }


    /**
     * 发送验证码
     */
    @Override
    public BaseResult SendCdoe() {
        return null;
    }


    /**
     * 注册账号
     */

    @Override
    public BaseResult RegisterAccount(String phoneNumber,String password) {

        HashMap<String, Object> stringStringHashMap = new HashMap<String, Object>();
        SnowFlakeGenerateIdWorker snowFlakeGenerateIdWorker = new SnowFlakeGenerateIdWorker(0L,0L);
        String id = snowFlakeGenerateIdWorker.generateNextId();
        stringStringHashMap.put("phoneNumber",phoneNumber);
        stringStringHashMap.put("password",password);
        stringStringHashMap.put("userId",id);
        stringStringHashMap.put("netName", RandomName.getNickName());
        logUser user = userMapper.findUserByPhoneNumber(phoneNumber);
        if (user != null){
            return BaseResult.fail("该用已存在！");
        }

        Integer integer = userMapper.addUser(stringStringHashMap);
        if (integer > 0){
            logUser loguser = new logUser();
            loguser.setPhone_number(phoneNumber);
            loguser.setPassword(password);
            loguser.setUser_id(id);
            return BaseResult.ok("注册成功",loguser);
        }

        return BaseResult.fail("注册失败");
    }


}
