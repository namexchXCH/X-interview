package com.xch.interview.controller;

import com.xch.interview.pojo.skill;
import com.xch.interview.service.skillService;
import com.xch.interview.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: skillController
 * @author: xiongconghui
 * @date: 2023-05-22 16:51
 **/

@RestController
public class skillController {

    @Autowired
    private skillService skillserviceImpl;

    @GetMapping("/interview/allskill")
    public BaseResult getAllSkill(){
        return  skillserviceImpl.getAllSkill();
    }

    @GetMapping("/interview/allskillmember")
    public BaseResult getAllskillMember(@RequestParam("skillId") String skillId ){
        return  skillserviceImpl.getAllskillMember(skillId);
    }

    @GetMapping("/interview/skillmemberanswer")
    public BaseResult getskillMemberAnswer(@RequestParam("memberId") String memberId){
        return skillserviceImpl.getskillMemberAnswer(memberId);
    }
}
