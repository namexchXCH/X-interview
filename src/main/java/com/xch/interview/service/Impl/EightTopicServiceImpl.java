package com.xch.interview.service.Impl;

import com.xch.interview.mapper.EightTopicMapper;
import com.xch.interview.pojo.EightTopic;
import com.xch.interview.pojo.MeightTopic;
import com.xch.interview.service.EightTopicService;
import com.xch.interview.utils.BaseResult;

import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 八股文题目
 * @author: xiongconghui
 * @date: 2023-05-09 20:53
 **/
@Service
public class EightTopicServiceImpl implements EightTopicService {
    @Resource
    private MongoTemplate mongoTemplate;
    @Resource
    private EightTopicMapper eightTopicMapper;
    @Override
    public BaseResult getgetallMeightTopic(String memberId) {

        List<EightTopic> eightTopics = eightTopicMapper.getgetallMeightTopic(memberId);
        return BaseResult.ok(eightTopics);
    }

    @Override
    public BaseResult getallTopicAnswer(String topicId) {
        Query query = new Query(Criteria.where("topicId").is(topicId));
        MeightTopic result = mongoTemplate.findOne(query, MeightTopic.class,"eighttopic");
        if (result==null){
            return BaseResult.fail("获取内容失败！");
        }
        return BaseResult.ok(result);
    }
}
