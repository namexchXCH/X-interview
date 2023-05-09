package com.xch.interview.controller;

import com.xch.interview.service.eightMemberService;
import com.xch.interview.utils.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: eightMemberController
 * @author: xiongconghui
 * @date: 2023-05-09 16:32
 **/
@RestController
public class eightMemberController {

   @Resource
   private eightMemberService eightMemberserviceImpl;

    /**
     * 获取所有八股文标签对应的八股文
     */
    @GetMapping("/interview/eightalllabelmember")
    public BaseResult getAllLabelMember(@RequestParam("labelId")String labelId){
        return  eightMemberserviceImpl.getAllLabelMember(labelId);
    }
}
