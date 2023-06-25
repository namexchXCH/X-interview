package com.xch.interview.controller;

import com.xch.interview.pojo.MskillMember;
import com.xch.interview.pojo.skill;
import com.xch.interview.pojo.skillMember;
import com.xch.interview.service.skillService;
import com.xch.interview.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    /**
     * 获取所有开放的技能
     */
    @GetMapping("/interview/allskill")
    public BaseResult getAllSkill(){
        return  skillserviceImpl.getAllSkill();
    }

    /**
     * 获取所有技能
     */
    @GetMapping("/interview/alltoskill")
    public BaseResult getAllToSkill(){
        return  skillserviceImpl.getAllToSkill();
    }


    @GetMapping("/interview/allskillmember")
    public BaseResult getAllskillMember(@RequestParam("skillId") String skillId ){
        return  skillserviceImpl.getAllskillMember(skillId);
    }

    @GetMapping("/interview/skillmemberanswer")
    public BaseResult getskillMemberAnswer(@RequestParam("memberId") String memberId){
        return skillserviceImpl.getskillMemberAnswer(memberId);
    }


    /**
     * 获取对应技能下member总数
     */
    @GetMapping("/interview/getskillmembernum")
    public BaseResult getSkillMemberNum(@RequestParam("skillId") String skillId ){
        return  skillserviceImpl.getSkillMemberNum(skillId);
    }

    /**
     * 获取对应技能下分页每页member数据
     */
    @GetMapping("/interview/getskillmemberpage")
    public BaseResult getSkillMemberPage(@RequestParam("skillId") String skillId,@RequestParam("pageNum") int pageNum ){
        return  skillserviceImpl.getSkillMemberPage(skillId,pageNum);
    }


    /**
     * 更改技能题目
     */
    @PutMapping("/interview/changeskillmenbertitle")
    public BaseResult changeSkillMenberTitle(@RequestBody skillMember skillmember){
        return  skillserviceImpl.changeSkillMenberTitle(skillmember);
    }


    /**
     * 更改技能题目开放与否
     */
    @PutMapping("/interview/changeskillmenberopen")
    public BaseResult changeSkillMenberOpen(@RequestBody skillMember skillmember){
        return  skillserviceImpl.changeSkillMenberOpen(skillmember);
    }


    /**
     * 更改技能题目文章内容
     */
    @PutMapping("/interview/exitmembertext")
    public BaseResult exitMemberText(@RequestBody MskillMember mskillMember){
        return  skillserviceImpl.exitMemberText(mskillMember);
    }


    /**
     * 删除题目文章内容
     */
    @DeleteMapping("/interview/deleteskillmembertext")
    public BaseResult DeleteSkillMemberText(@RequestParam("memberId") String memberId) {
        return skillserviceImpl.DeleteSkillMemberText(memberId);
    }


    /**
     * 技能标签开关
     */
    @PutMapping("/interview/changeskillisopem")
    public BaseResult changeSkillIsopem(@RequestBody skill myskill) {
        return skillserviceImpl.changeSkillIsopem(myskill);
    }



    /**
     * 添加模块题目
     */
    @PostMapping("/interview/addskillmember")
    public BaseResult addSkillSember(@RequestBody skillMember skillmember) {
        return skillserviceImpl.addSkillSember(skillmember);
    }



    /**
     * 添加技能标签
     */
    @PostMapping("/interview/addskill")
    public BaseResult addSkill(@RequestBody skill myskill) {
        return skillserviceImpl.addSkill(myskill);
    }


    /**
     * 更改标签名字
     */
    @PutMapping("/interview/editskillname")
    public BaseResult editSkillName(@RequestBody skill myskill) {
        return skillserviceImpl.editSkillName(myskill);
    }


    /**
     * 删除标签
     */
    @DeleteMapping("/interview/deleteskill")
    public BaseResult deleteSkillById(@RequestParam("skillId") String skillId) {
        return skillserviceImpl.deleteSkillById(skillId);
    }

}
