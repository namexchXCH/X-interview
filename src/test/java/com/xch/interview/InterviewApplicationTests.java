package com.xch.interview;

import com.xch.interview.mapper.eightPartMapper;
import com.xch.interview.service.QiniuOSSService;
import com.xch.interview.utils.SnowFlakeGenerateIdWorker;
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
    @Resource
    private eightPartMapper eightpartMapper;
    @Resource
    private QiniuOSSService qiniuOSSService;
    @Test
    void contextLoads() throws InterruptedException {
//        boolean comment1 = mongoTemplate.collectionExists("comment");
//        System.out.println(comment1);
//        Long add = stringRedisTemplate.opsForSet().add("nnnnnn", "serfgsefgsdfgsf");
//        stringRedisTemplate.opsForValue().set("sdfgsd","sdfgsdfgsfgsfdg");
//        System.out.println(add);
//        stringRedisTemplate.opsForValue().set("xch","18586780471",2L, TimeUnit.MINUTES);

//        String main = tokenUtil.sign("18586780471");
//        System.out.println(main);
//        String kkk ="18586780471";
//        String substring = kkk.substring(kkk.length() - 4, kkk.length());
//        System.out.println(substring);


        SnowFlakeGenerateIdWorker snowFlakeGenerateIdWorker = new SnowFlakeGenerateIdWorker(0L,0L);
        for (int i = 0; i <10;i++){
            System.out.println(snowFlakeGenerateIdWorker.generateNextId());
        }

//        System.out.println(eightpartMapper.getAllLabel().toString());
//        String delete = qiniuOSSService.delete("interview1/xch");
//        System.out.println(delete);

    }

}
