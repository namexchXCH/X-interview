package com.xch.interview.service.Impl;

import com.mongodb.client.result.UpdateResult;
import com.xch.interview.mapper.EightTopicMapper;
import com.xch.interview.pojo.EightTopic;
import com.xch.interview.pojo.MeightTopic;
import com.xch.interview.service.EightTopicService;
import com.xch.interview.utils.BaseResult;

import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
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
    /**
     * @Param PAGE_SIZE 分页获取每页大小
     */
    private static int PAGE_SIZE = 10;
    private static String COLLECTION_NAME = "eighttopic";
    private static String TOPIC_ID = "topicId";
    private static String ARTICLE_TEXT = "articleText";
    @Resource
    private MongoTemplate mongoTemplate;
    @Resource
    private EightTopicMapper eightTopicMapper;
    @Override
    public BaseResult getAllMeightTopic(String memberId) {

        List<EightTopic> eightTopics = eightTopicMapper.getAllMeightTopic(memberId);
        if (eightTopics.size()<0) {
            return BaseResult.fail("获取失败！");
        }
        return BaseResult.ok(eightTopics);
    }

    @Override
    public BaseResult getallTopicAnswer(String topicId) {
        Query query = new Query(Criteria.where(TOPIC_ID).is(topicId));
        MeightTopic result = mongoTemplate.findOne(query, MeightTopic.class,COLLECTION_NAME);
        if (result==null){
            return BaseResult.fail("暂时还没有内容！");
        }
        return BaseResult.ok(result);
    }

    @Override
    public BaseResult getEightTopic(int PageNum, String memberId) {

        PageNum = PAGE_SIZE*(PageNum - 1);
        List<EightTopic> eightTopic = eightTopicMapper.getEightTopic(PageNum, memberId);
        return BaseResult.ok(eightTopic);
    }

    @Override
    public BaseResult getPageSize(String memberId) {
        int pageSize = eightTopicMapper.getPageSize(memberId);
        return BaseResult.ok(pageSize);
    }

    @Override
    public BaseResult changeTopicOpen(String topicId, int isOpen) {
        int i = eightTopicMapper.changeTopicOpen(topicId, isOpen);
        if  ( i > 0 ){
            return BaseResult.ok("ok");
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult ExitSaveTopic(MeightTopic meightTopic) {
        // 创建条件对象
        Criteria criteria = Criteria.where(TOPIC_ID).is(meightTopic.getTopicId());
        // 创建查询对象，然后将条件对象添加到其中
        Query query = new Query(criteria);
        // 创建更新对象,并设置更新的内容
        Update update = new Update().set(ARTICLE_TEXT, meightTopic.getArticleText());
        // 执行更新，如果没有找到匹配查询的文档，则创建并插入一个新文档
        UpdateResult result = mongoTemplate.upsert(query, update, MeightTopic.class, COLLECTION_NAME);
        if (result.getMatchedCount() <= 0){
            return BaseResult.fail("fail");
        }
        System.out.println(result.getMatchedCount());

        return BaseResult.ok("OK");
    }
}
