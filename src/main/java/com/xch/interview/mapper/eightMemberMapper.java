package com.xch.interview.mapper;

import com.xch.interview.pojo.member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

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
    List<member> getAllLabelMember(String labelId);
}
