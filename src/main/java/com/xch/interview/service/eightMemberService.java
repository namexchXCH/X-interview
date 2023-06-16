package com.xch.interview.service;

import com.xch.interview.pojo.member;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 八股文标签下具体模块
 * @author: xiongconghui
 * @date: 2023-05-09 16:34
 **/
public interface eightMemberService {
    /**
     * 获取所有八股文标签的内容
     */
    BaseResult getAllLabelMember(String labelId);

    /**
     * 获取所有八股文标签对应的所有八股文
     */
    BaseResult getEightallMember(String labelId);

    /**
     * 修改八股文是否开放 isActive字段
     */
    BaseResult changeMemberActive( member Member);

    /**
     * 修改八股文是否需要会员 isMemberRequired字段
     */
    BaseResult changeMemberRequired(member Member);

    /**
     * 修改八股文模member信息
     */
    BaseResult EditEightModule(member Member);

    /**
     * 新增八股文member
     */
    BaseResult addNewEightModule( member Member);


    /**
     * 八股文member没有任何八股文类容的情况下删除member
     */
    BaseResult deleteEightModule(String memberId);
}
