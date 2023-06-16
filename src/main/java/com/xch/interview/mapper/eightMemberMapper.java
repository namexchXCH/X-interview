package com.xch.interview.mapper;

import com.xch.interview.pojo.member;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: eightMemberMapper
 * @author: xiongconghui
 * @date: 2023-05-09 16:33
 **/

@Mapper
@Component
public interface eightMemberMapper {

    /**
     * 获取所有八股文标签的内容
     */
    List<member> getAllLabelMember(@Param("labelId")String labelId);

    /**
     * 获取所有八股文标签对应的所有八股文
     */
    List<member> getEightallMember(@Param("labelId")String labelId);

    /**
     * 修改八股文是否开放 isActive字段
     */
    int changeMemberActive( member Member);

    /**
     * 修改八股文是否需要会员 isMemberRequired字段
     */
    int changeMemberRequired(member Member);

    /**
     * 修改八股文模member信息
     */
    int EditEightModule(member Member);

    /**
     * 新增八股文member
     */
    int addNewEightModule(member Member);

    /**
     * 八股文member没有任何八股文类容的情况下删除member
     */
    int deleteEightModule(@Param("memberId") String memberId);
}
