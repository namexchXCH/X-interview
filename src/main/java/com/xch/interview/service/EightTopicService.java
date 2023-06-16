package com.xch.interview.service;

import com.xch.interview.pojo.EightTopic;
import com.xch.interview.pojo.MeightTopic;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 *
 * 八股文题目
 * @author: xiongconghui
 * @date: 2023-05-09 20:53
 **/
public interface EightTopicService {

     BaseResult getAllMeightTopic(String memberId);

     BaseResult getallTopicAnswer(String topicId);

     /**
      * 分页获取题目
      */
     BaseResult getEightTopic( int PageNum, String memberId);

     /**
      * 获取题目数
      */
     BaseResult getPageSize(String memberId);

     /**
      * 更改题目是否开放
      */
     BaseResult changeTopicOpen(String topicId,int isOpen);

     /**
      * 更改题目是否开放
      */
   BaseResult ExitSaveTopic( MeightTopic meightTopic);
}
