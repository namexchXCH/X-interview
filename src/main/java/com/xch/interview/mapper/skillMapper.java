package com.xch.interview.mapper;

import com.xch.interview.pojo.skill;
import com.xch.interview.pojo.skillMember;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: skillMapper
 * @author: xiongconghui
 * @date: 2023-05-22 16:54
 **/

@Mapper
@Component
public interface skillMapper {

    /**
     * 获取所有开放的技能
     */
    List<skill> getAllSkill();

    /**
     * 获取所有技能
     */
    List<skill> getAllToSkill();

    /**
     * 技能标签开关
     */
    int changeSkillIsopem( skill myskill);


    /**
     * 添加技能标签
     */
    int addSkill( skill myskill);

    /**
     * 更改标签名字
     */
    int editSkillName(skill myskill);


    /**
     * 删除标签
     */
    int deleteSkillById(@Param("skillId") String skillId);




}
