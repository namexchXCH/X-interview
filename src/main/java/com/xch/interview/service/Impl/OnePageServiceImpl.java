package com.xch.interview.service.Impl;


import com.mongodb.client.result.UpdateResult;

import com.xch.interview.pojo.OnePage;
import com.xch.interview.service.OnePageService;
import com.xch.interview.utils.BaseResult;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: OnePageServiceImpl
 * @author: xiongconghui
 * @date: 2023-06-24 15:24
 **/
@Service
public class OnePageServiceImpl implements OnePageService {
    private static final String COLLECTIO_NNAME ="onepage";
    private static final String ONE_PAGE_ID = "1097964992621182976";
    private static final String WEB_INFO_ID = "1097964992621182977";
    private static final String WEB_TIME_INFO_ID = "1097964992621182978";

    private static final String ID = "onePageId";
    private static final String ONE_PAGE_TEXT = "onePageText";
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public BaseResult getOnePageData() {
        Query query = new Query(Criteria.where(ID).is(ONE_PAGE_ID));
        OnePage result = mongoTemplate.findOne(query, OnePage.class,COLLECTIO_NNAME);
        if (result==null){
            return BaseResult.fail("获取内容失败！");
        }
        return BaseResult.ok(result);
    }

    @Override
    public BaseResult editOnePageData(OnePage onePage) {
        // 创建条件对象
        Criteria criteria = Criteria.where(ID).is(ONE_PAGE_ID);
        // 创建查询对象，然后将条件对象添加到其中
        Query query = new Query(criteria);
        // 创建更新对象,并设置更新的内容
        Update update = new Update().set(ONE_PAGE_TEXT, onePage.getOnePageText());
        // 执行更新，如果没有找到匹配查询的文档，则创建并插入一个新文档
        UpdateResult result = mongoTemplate.upsert(query, update, OnePage.class, COLLECTIO_NNAME);

        if (result.getMatchedCount() <= 0 && result.getUpsertedId() == null){
            return BaseResult.fail("fail");
        }
        return BaseResult.ok("OK");
    }

    @Override
    public BaseResult getWebTimeLine() {
        Query query = new Query(Criteria.where(ID).is(WEB_TIME_INFO_ID));
        OnePage result = mongoTemplate.findOne(query, OnePage.class,COLLECTIO_NNAME);
        if (result==null){
            return BaseResult.fail("获取内容失败！");
        }
        return BaseResult.ok(result);
    }

    @Override
    public BaseResult editWebTimeLine(OnePage onePage) {
        // 创建条件对象
        Criteria criteria = Criteria.where(ID).is(WEB_TIME_INFO_ID);
        // 创建查询对象，然后将条件对象添加到其中
        Query query = new Query(criteria);
        // 创建更新对象,并设置更新的内容
        Update update = new Update().set(ONE_PAGE_TEXT, onePage.getOnePageText());
        // 执行更新，如果没有找到匹配查询的文档，则创建并插入一个新文档
        UpdateResult result = mongoTemplate.upsert(query, update, OnePage.class, COLLECTIO_NNAME);

        if (result.getMatchedCount() <= 0 && result.getUpsertedId() == null){
            return BaseResult.fail("fail");
        }
        return BaseResult.ok("OK");
    }

    @Override
    public BaseResult getWebInfo() {
        Query query = new Query(Criteria.where(ID).is(WEB_INFO_ID));
        OnePage result = mongoTemplate.findOne(query, OnePage.class,COLLECTIO_NNAME);
        if (result==null){
            return BaseResult.fail("获取内容失败！");
        }
        return BaseResult.ok(result);
    }

    @Override
    public BaseResult editWebInfo(OnePage onePage) {
        // 创建条件对象
        Criteria criteria = Criteria.where(ID).is(WEB_INFO_ID);
        // 创建查询对象，然后将条件对象添加到其中
        Query query = new Query(criteria);
        // 创建更新对象,并设置更新的内容
        Update update = new Update().set(ONE_PAGE_TEXT, onePage.getOnePageText());
        // 执行更新，如果没有找到匹配查询的文档，则创建并插入一个新文档
        UpdateResult result = mongoTemplate.upsert(query, update, OnePage.class, COLLECTIO_NNAME);

        if (result.getMatchedCount() <= 0 && result.getUpsertedId() == null){
            return BaseResult.fail("fail");
        }
        return BaseResult.ok("OK");
    }
}
