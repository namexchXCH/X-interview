package com.xch.interview.controller;

import com.xch.interview.pojo.member;
import com.xch.interview.service.eightMemberService;
import com.xch.interview.utils.BaseResult;
import org.springframework.web.bind.annotation.*;

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
     * 获取所有八股文标签对应已经开放的八股文
     */
    @GetMapping("/interview/eightalllabelmember")
    public BaseResult getAllLabelMember(@RequestParam("labelId") String labelId){
        return  eightMemberserviceImpl.getAllLabelMember(labelId);
    }

    /**
     * 获取所有八股文标签对应的所有八股文
     */
    @GetMapping("/interview/eightallmember")
    public BaseResult getEightallMember(@RequestParam("labelId") String labelId){
        return  eightMemberserviceImpl.getEightallMember(labelId);
    }


    /**
     * 修改八股文是否开放 isActive字段
     */
    @PutMapping("/interview/changememberactive")
    public BaseResult changeMemberActive(@RequestBody member Member) {
        return eightMemberserviceImpl.changeMemberActive(Member);
    }

    /**
     * 修改八股文是否需要会员 isMemberRequired字段
     */
    @PutMapping("/interview/changememberrequired")
    public BaseResult changeMemberRequired(@RequestBody member Member) {
        return eightMemberserviceImpl.changeMemberRequired(Member);
    }


    /**
     * 修改八股文member信息
     */
    @PutMapping("/interview/editeightmodule")
    public BaseResult EditEightModule(@RequestBody member Member) {
        return eightMemberserviceImpl.EditEightModule(Member);
    }


    /**
     * 新增八股文member
     */
    @PostMapping("/interview/addneweightmodule")
    public BaseResult addNewEightModule(@RequestBody member Member){
        return  eightMemberserviceImpl.addNewEightModule(Member);
    }


    /**
     * 八股文member没有任何八股文类容的情况下删除member
     */
    @DeleteMapping("/interview/deleteeightmodule")
    public BaseResult deleteEightModule(@RequestParam("memberId") String memberId){
        return eightMemberserviceImpl.deleteEightModule(memberId);
    }


}
