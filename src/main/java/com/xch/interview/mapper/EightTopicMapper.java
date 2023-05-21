package com.xch.interview.mapper;

import com.xch.interview.pojo.EightTopic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: EightTopicMapper
 * @author: xiongconghui
 * @date: 2023-05-09 20:53
 **/

@Mapper
@Component
public interface EightTopicMapper {

    public List<EightTopic> getgetallMeightTopic(String memberId);
}
