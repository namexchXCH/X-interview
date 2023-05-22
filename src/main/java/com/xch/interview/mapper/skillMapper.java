package com.xch.interview.mapper;

import com.xch.interview.pojo.skill;
import com.xch.interview.pojo.skillMember;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

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
     * 获取所有技能
     */
    List<skill> getAllSkill();




}
