package com.xch.interview.mapper;

import com.xch.interview.pojo.label;
import com.xch.interview.pojo.member;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: eightPartMapper
 * @author: xiongconghui
 * @date: 2023-05-08 14:11
 **/
@Mapper
@Component
public interface eightPartMapper {

    /**
     * 获取所有八股文标签
     */
    List<label> getAllLabel();


}
