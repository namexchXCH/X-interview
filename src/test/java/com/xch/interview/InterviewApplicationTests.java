package com.xch.interview;

import com.xch.interview.utils.tokenUtil;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class InterviewApplicationTests {
    @Resource
    private MongoTemplate mongoTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() throws InterruptedException {
//        boolean comment1 = mongoTemplate.collectionExists("comment");
//        System.out.println(comment1);
//        Long add = stringRedisTemplate.opsForSet().add("nnnnnn", "serfgsefgsdfgsf");
//        stringRedisTemplate.opsForValue().set("sdfgsd","sdfgsdfgsfgsfdg");
//        System.out.println(add);
//        stringRedisTemplate.opsForValue().set("xch","18586780471",2L, TimeUnit.MINUTES);

        String main = tokenUtil.sign("18586780471");
        System.out.println(main);
        String kkk ="18586780471";
        String substring = kkk.substring(kkk.length() - 4, kkk.length());
        System.out.println(substring);
    }

}
