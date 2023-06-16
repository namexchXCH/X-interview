package com.xch.interview.mapper;

import com.xch.interview.pojo.label;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
     * 获取所有开放的八股文标签
     */
    List<label> getAllLabel();

    /**
     * 获取所有八股文标签
     */
    List<label> getLabels();

    /**
     * 改变八股文标签状态isActive
     */
    int changeModuleActive(label Label);

    /**
     *新增八股文标签
     */
    int addNewLable(label Label);


    /**
     *修改八股文标签
     */
    int EditLabel( label Label);


}
