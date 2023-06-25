package com.xch.interview.mapper;

import com.xch.interview.pojo.MskillMember;
import com.xch.interview.pojo.skillMember;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: skillMemberMapper
 * @author: xiongconghui
 * @date: 2023-05-22 17:38
 **/

@Mapper
@Component
public interface skillMemberMapper {

    /**
     *获取该技能下的子模块
     */
    List<skillMember> getAllskillMember(String skillId);

    /**
     * 获取对应技能下member总数
     */
    int getSkillMemberNum(@Param("skillId") String skillId );

    /**
     * 获取对应技能下分页每页member数据
     */
    List<skillMember> getSkillMemberPage(@Param("skillId") String skillId, @Param("pageNum") int pageNum );

    /**
     * 更改技能题目
     */
    int changeSkillMenberTitle(skillMember skillmember);


    /**
     * 更改技能题目是否开放
     */
     int changeSkillMenberOpen(skillMember skillmember);

    /**
     * 删除技能题目文章内容
     */
    int DeleteSkillMemberText(@Param("memberId") String memberId) ;

    /**
     * 添加模块题目
     */
    int addSkillSember(skillMember skillmember);

    /**
     * 查找模块题目
     */
    List<skillMember> SearchOneskillMemberBySkillId(@Param("skillId") String skillId);


}
