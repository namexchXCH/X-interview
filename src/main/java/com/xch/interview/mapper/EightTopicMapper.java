package com.xch.interview.mapper;

import com.xch.interview.pojo.EightTopic;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName: EightTopicMapper
 * @author: xiongconghui
 * @date: 2023-05-09 20:53
 **/

@Mapper
@Component
public interface EightTopicMapper {

     /**
      * 获取一个模块下所有八股文题目
      */
     List<EightTopic> getAllMeightTopic(@Param("memberId") String memberId);


     List<EightTopic> getOneMeightTopic(@Param("memberId") String memberId);

     /**
      * 分页获取题目
      */
     List<EightTopic> getEightTopic(@Param("PageNum") int PageNum,@Param("memberId") String memberId);

     /**
      * 获取题目数
      */
     int getPageSize(@Param("memberId") String memberId);

     /**
      * 更改题目是否开放
      */
     int changeTopicOpen(@Param("topicId") String topicId,@Param("isOpen") int isOpen);

     /**
      * 删除八股文题目topic
      */
     int DeleteEightTopic(@Param("topicId")String topicId);

     /**
      * 更改题目
      */
     int SaveEditEightTitle(EightTopic eightTopic);

     /**
      * 新增题目
      */
     int SaveNewTopic(EightTopic eightTopic);


}
