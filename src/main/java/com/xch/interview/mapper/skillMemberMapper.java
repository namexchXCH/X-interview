package com.xch.interview.mapper;

import com.xch.interview.pojo.skillMember;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

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
}
