package com.xch.interview;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class InterviewApplicationTests {
    @Resource
    private MongoTemplate mongoTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
//        boolean comment1 = mongoTemplate.collectionExists("comment");
//        System.out.println(comment1);

        Long add = stringRedisTemplate.opsForSet().add("nnnnnn", "serfgsefgsdfgsf");
        stringRedisTemplate.opsForValue().set("sdfgsd","sdfgsdfgsfgsfdg");
        System.out.println(add);

    }

}
