package com.xch.interview.service.Impl;

import com.xch.interview.mapper.skillMapper;
import com.xch.interview.mapper.skillMemberMapper;
import com.xch.interview.pojo.MeightTopic;
import com.xch.interview.pojo.MskillMember;
import com.xch.interview.pojo.skill;
import com.xch.interview.pojo.skillMember;
import com.xch.interview.service.skillService;
import com.xch.interview.utils.BaseResult;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: skillServiceImpl
 * @author: xiongconghui
 * @date: 2023-05-22 16:55
 **/
@Service
public class skillServiceImpl implements skillService {

    @Resource
    private skillMapper skillmapper;
    @Resource
    private MongoTemplate mongoTemplate;

    @Resource
    private skillMemberMapper skillmemberMapper;


    @Override
    public BaseResult getAllSkill() {
        List<skill> allSkill = skillmapper.getAllSkill();
        if (allSkill.size() <1) {
            return BaseResult.fail("暂时还没有内容！");
        }
        return BaseResult.ok(allSkill);
    }

    @Override
    public BaseResult getAllskillMember(String skillId) {

        List<skillMember> allskillMember = skillmemberMapper.getAllskillMember(skillId);
        if (allskillMember.size() < 1){
          return BaseResult.fail("暂时还没有内容！");
        }
        return BaseResult.ok(allskillMember);
    }

    @Override
    public BaseResult getskillMemberAnswer(String memberId) {
        Query query = new Query(Criteria.where("MemberId").is(memberId));
        MskillMember result = mongoTemplate.findOne(query, MskillMember.class,"skillmember");
        if (result==null){
            return BaseResult.fail("获取内容失败！");
        }
        return BaseResult.ok(result);
    }
}
