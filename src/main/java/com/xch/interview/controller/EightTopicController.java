package com.xch.interview.controller;

import com.xch.interview.pojo.MeightTopic;
import com.xch.interview.service.EightTopicService;
import com.xch.interview.utils.BaseResult;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

        return  eightTopicServiceimpl.getgetallMeightTopic(memberId);
    }

   /**
    * 获取题目对应的答案
    */
    @GetMapping("/interview/getTopicanswer")
    public BaseResult getallTopicAnswer(@RequestParam("topicId") String topicId){
        return  eightTopicServiceimpl.getallTopicAnswer(topicId);
    }

}
