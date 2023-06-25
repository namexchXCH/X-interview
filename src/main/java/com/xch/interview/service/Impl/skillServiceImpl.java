package com.xch.interview.service.Impl;

import com.mongodb.client.result.UpdateResult;
import com.xch.interview.mapper.skillMapper;
import com.xch.interview.mapper.skillMemberMapper;
import com.xch.interview.pojo.MeightTopic;
import com.xch.interview.pojo.MskillMember;
import com.xch.interview.pojo.skill;
import com.xch.interview.pojo.skillMember;
import com.xch.interview.service.skillService;
import com.xch.interview.utils.BaseResult;
import com.xch.interview.utils.SnowFlakeGenerateIdWorker;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: skillServiceImpl
 * @author: xiongconghui
 * @date: 2023-05-22 16:55
 **/
@Service
public class skillServiceImpl implements skillService {
    private static int PAGE_SIZE = 10;
    private static String COLLECTION_NAME = "skillmember";
    private static String MEMBER_ID = "memberId";
    private static String MEMBER_TEXT = "memberText";

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
    public BaseResult getAllToSkill() {
        List<skill> allToSkill = skillmapper.getAllToSkill();
        if (allToSkill.size() <1) {
            return BaseResult.fail("暂时还没有内容！");
        }
        return BaseResult.ok(allToSkill);
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
        Query query = new Query(Criteria.where(MEMBER_ID).is(memberId));
        MskillMember result = mongoTemplate.findOne(query, MskillMember.class,COLLECTION_NAME);
        if (result==null){
            return BaseResult.fail("获取内容失败！");
        }
        return BaseResult.ok(result);
    }

    @Override
    public BaseResult getSkillMemberNum(String skillId) {

        int skillMemberNum = skillmemberMapper.getSkillMemberNum(skillId);
        return BaseResult.ok(skillMemberNum);
    }

    @Override
    public BaseResult getSkillMemberPage(String skillId, int pageNum) {
        pageNum = PAGE_SIZE*(pageNum - 1);
        List<skillMember> skillMemberPage = skillmemberMapper.getSkillMemberPage(skillId, pageNum);
        return BaseResult.ok(skillMemberPage);
    }

    @Override
    public BaseResult changeSkillMenberTitle(skillMember skillmember) {
        int i = skillmemberMapper.changeSkillMenberTitle(skillmember);
        if  ( i > 0 ){
            return BaseResult.ok("ok");
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult changeSkillMenberOpen(skillMember skillmember) {
        int i = skillmemberMapper.changeSkillMenberOpen(skillmember);
        if  ( i > 0 ){
            return BaseResult.ok("ok");
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult exitMemberText(MskillMember mskillMember) {
        // 创建条件对象
        Criteria criteria = Criteria.where(MEMBER_ID).is(mskillMember.getMemberId());
        // 创建查询对象，然后将条件对象添加到其中
        Query query = new Query(criteria);
        // 创建更新对象,并设置更新的内容
        Update update = new Update().set(MEMBER_TEXT, mskillMember.getMemberText());
        // 执行更新，如果没有找到匹配查询的文档，则创建并插入一个新文档
        UpdateResult result = mongoTemplate.upsert(query, update, MeightTopic.class, COLLECTION_NAME);

        if (result.getMatchedCount() <= 0 && result.getUpsertedId() == null){
            return BaseResult.fail("fail");
        }
        return BaseResult.ok("OK");
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public BaseResult DeleteSkillMemberText(String memberId) {
        int resultNum = skillmemberMapper.DeleteSkillMemberText(memberId);
        if (resultNum > 0){
            // 创建条件对象
            Criteria criteria = Criteria.where(MEMBER_ID).is(memberId);
            // 创建查询对象，然后将条件对象添加到其中
            Query query = new Query(criteria);
            // 执行删除查找到的匹配的第一条文档,并返回删除的文档信息
            MskillMember result = mongoTemplate.findAndRemove(query, MskillMember.class, COLLECTION_NAME);
        }else{
            return BaseResult.fail("fail");
        }
        return BaseResult.ok("OK");
    }

    @Override
    public BaseResult changeSkillIsopem(skill myskill) {
        int i = skillmapper.changeSkillIsopem(myskill);
        if  ( i > 0 ){
            return BaseResult.ok("ok");
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult addSkillSember(skillMember skillmember) {
        SnowFlakeGenerateIdWorker snowFlakeGenerateIdWorker = new SnowFlakeGenerateIdWorker(0L,0L);
//        设置id
        String Id = snowFlakeGenerateIdWorker.generateNextId();
        skillmember.setMemberId(Id);
        skillmember.setIsOpen(0);
        int i = skillmemberMapper.addSkillSember(skillmember);
        if  ( i > 0 ){
            return BaseResult.ok(skillmember);
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult addSkill(skill myskill) {
        SnowFlakeGenerateIdWorker snowFlakeGenerateIdWorker = new SnowFlakeGenerateIdWorker(0L,0L);
//        设置id
        String Id = snowFlakeGenerateIdWorker.generateNextId();
        myskill.setIsActive(0);
        myskill.setSkillId(Id);
        int i = skillmapper.addSkill(myskill);
        if  ( i > 0 ){
            return BaseResult.ok(myskill);
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult editSkillName(skill myskill) {
        int i = skillmapper.editSkillName(myskill);
        if  ( i > 0 ){
            return BaseResult.ok("ok");
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult deleteSkillById(String skillId) {
        List<skillMember> skillMembers = skillmemberMapper.SearchOneskillMemberBySkillId(skillId);
        if (skillMembers.size() > 0){
          return BaseResult.fail("该模块还有数据，不能删除");
        }

        int i = skillmapper.deleteSkillById(skillId);
        if  ( i > 0 ){
            return BaseResult.ok("ok");
        }
       return BaseResult.fail("fail");
    }
}
