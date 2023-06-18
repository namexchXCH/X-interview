package com.xch.interview.service.Impl;

import com.xch.interview.mapper.EightTopicMapper;
import com.xch.interview.mapper.eightMemberMapper;
import com.xch.interview.pojo.EightTopic;
import com.xch.interview.pojo.member;
import com.xch.interview.service.eightMemberService;
import com.xch.interview.utils.BaseResult;
import com.xch.interview.utils.SnowFlakeGenerateIdWorker;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 八股文标签下具体模块
 * @author: xiongconghui
 * @date: 2023-05-09 16:35
 **/
@Service
public class eightMemberServiceImpl implements eightMemberService {

    @Resource
    private eightMemberMapper eightMembermapper;
    @Resource
    private EightTopicMapper eightTopicMapper;
    @Override
    public BaseResult getAllLabelMember(String labelId) {
        List<member> allLabelMember = eightMembermapper.getAllLabelMember(labelId);
        return BaseResult.ok(allLabelMember);
    }

    @Override
    public BaseResult getEightallMember(String labelId) {
        List<member> eightallMember = eightMembermapper.getEightallMember(labelId);
        return BaseResult.ok(eightallMember);
    }

    @Override
    public BaseResult changeMemberActive(member Member) {
        int i = eightMembermapper.changeMemberActive(Member);
        if ( i > 0 ){
            return BaseResult.ok("ok");
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult changeMemberRequired(member Member) {
        int i = eightMembermapper.changeMemberRequired(Member);
        if ( i > 0 ){
            return BaseResult.ok("ok");
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult EditEightModule(member Member) {
        int i = eightMembermapper.EditEightModule(Member);
        if ( i > 0 ){
            return BaseResult.ok("ok");
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult addNewEightModule(member Member) {
        SnowFlakeGenerateIdWorker snowFlakeGenerateIdWorker = new SnowFlakeGenerateIdWorker(0L,0L);
//        设置id
        String Id = snowFlakeGenerateIdWorker.generateNextId();
        snowFlakeGenerateIdWorker.generateNextId();
        Member.setMemberId(Id);
        int i = eightMembermapper.addNewEightModule(Member);
        if ( i > 0 ){
            return BaseResult.ok(Member);
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult deleteEightModule(String memberId) {
        List<EightTopic> oneMeightTopic = eightTopicMapper.getOneMeightTopic(memberId);
        if (oneMeightTopic.size() > 0){
            return BaseResult.fail("该模块下还有数据，不可以删除");
        }
        System.out.println(oneMeightTopic.toString());
        int i = eightMembermapper.deleteEightModule(memberId);
        if  ( i > 0 ){
            return BaseResult.ok("ok");
        }
        return BaseResult.fail("fail");
    }


}
