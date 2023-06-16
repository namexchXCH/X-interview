package com.xch.interview.controller;

import com.xch.interview.pojo.MeightTopic;
import com.xch.interview.service.EightTopicService;
import com.xch.interview.utils.BaseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName: EightTopicController
 * @author: xiongconghui
 * @date: 2023-05-09 20:52
 **/
@RestController
public class EightTopicController {

    @Resource
    private EightTopicService eightTopicServiceimpl;


    /**
     * 获取题目列表
     */
    @GetMapping("/interview/getallMeightTopic")
    public BaseResult getallMeightTopic(@RequestParam("memberId") String memberId){
        return  eightTopicServiceimpl.getAllMeightTopic(memberId);
    }

   /**
    * 获取题目对应的答案
    */
    @GetMapping("/interview/getTopicanswer")
    public BaseResult getallTopicAnswer(@RequestParam("topicId") String topicId){
        return  eightTopicServiceimpl.getallTopicAnswer(topicId);
    }

    /**
     * 分页获取题目
     */
    @GetMapping("/interview/geteighttopic")
    public BaseResult getEightTopic(@RequestParam("PageNum") int PageNum,@RequestParam("memberId")String memberId){
        return eightTopicServiceimpl.getEightTopic(PageNum,memberId);
    }

    /**
     * 获取题目数
     */
    @GetMapping("/interview/getpagesize")
    public BaseResult getPageSize(@RequestParam("memberId") String memberId){
        return eightTopicServiceimpl.getPageSize(memberId);
    }


    /**
     * 更改题目是否开放
     */
    @PutMapping("/interview/changetopicopen")
    public BaseResult changeTopicOpen(@RequestParam("topicId") String topicId,@RequestParam("isOpen") int isOpen){
        return eightTopicServiceimpl.changeTopicOpen(topicId,isOpen);
    }

    /**
     * 更改题目类容
     */
    @PutMapping("/interview/exittopic")
    public BaseResult ExitSaveTopic(@RequestBody MeightTopic meightTopic){
        return eightTopicServiceimpl.ExitSaveTopic(meightTopic);
    }


}
