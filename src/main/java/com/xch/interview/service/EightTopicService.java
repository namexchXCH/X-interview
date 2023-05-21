package com.xch.interview.service;

import com.xch.interview.pojo.EightTopic;
import com.xch.interview.utils.BaseResult;

import java.util.List;

/**
 *
 * 八股文题目
 * @author: xiongconghui
 * @date: 2023-05-09 20:53
 **/
public interface EightTopicService {

    public BaseResult getgetallMeightTopic(String memberId);
    public BaseResult getallTopicAnswer(String topicId);
}
