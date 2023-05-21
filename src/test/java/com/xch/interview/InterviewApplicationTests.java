package com.xch.interview;

import com.mongodb.client.MongoCollection;
import com.xch.interview.mapper.eightPartMapper;
import com.xch.interview.pojo.MeightTopic;
import com.xch.interview.service.QiniuOSSService;
import com.xch.interview.utils.SnowFlakeGenerateIdWorker;
import com.xch.interview.utils.tokenUtil;
import org.bson.Document;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class InterviewApplicationTests {
    @Resource
    private MongoTemplate mongoTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private eightPartMapper eightpartMapper;
    @Resource
    private QiniuOSSService qiniuOSSService;
    @Test
    void contextLoads() throws InterruptedException {

        SnowFlakeGenerateIdWorker snowFlakeGenerateIdWorker = new SnowFlakeGenerateIdWorker(0L,0L);
        for (int i = 0; i <10;i++){
            System.out.println(snowFlakeGenerateIdWorker.generateNextId());
        }


    }

    @Test
    public void test3(){

        MeightTopic meightTopic ;
        for (long i = 0; i < 83; i++) {
            meightTopic = new MeightTopic();
            meightTopic.setTopicId((1105525201094836224L +i)+"");
            meightTopic.setArticleText(""+ UUID.randomUUID());
            MeightTopic save = mongoTemplate.save(meightTopic);
        }
//
//        MeightTopic byId = mongoTemplate.findById("1105525201094836301", MeightTopic.class);
//        System.out.println(byId.toString());

//        Query query = new Query(Criteria.where("topicId").is("1105525201094836307"));
//        MeightTopic result = mongoTemplate.findOne(query, MeightTopic.class);
//        System.out.println(result);

//        for (long i = 0; i < 83; i++) {
//            System.out.println("INSERT INTO eighttopic VALUES ('"+(i+1105525201094836224L)+"','1105525201094836224', 'cfghjcfg');");
//
//        }
    }

}
