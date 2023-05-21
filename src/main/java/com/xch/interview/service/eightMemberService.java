package com.xch.interview.service;

import com.xch.interview.pojo.member;
import com.xch.interview.utils.BaseResult;

import java.util.List;

/**
 * 八股文标签下具体模块
 * @author: xiongconghui
 * @date: 2023-05-09 16:34
 **/
public interface eightMemberService {

    BaseResult getAllLabelMember(String labelId);
}
