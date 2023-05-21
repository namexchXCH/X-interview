package com.xch.interview.service.Impl;

import com.xch.interview.mapper.eightMemberMapper;
import com.xch.interview.pojo.member;
import com.xch.interview.service.eightMemberService;
import com.xch.interview.utils.BaseResult;
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
    @Override
    public BaseResult getAllLabelMember(String labelId) {
        List<member> allLabelMember = eightMembermapper.getAllLabelMember(labelId);
        return BaseResult.ok(allLabelMember);
    }
}
