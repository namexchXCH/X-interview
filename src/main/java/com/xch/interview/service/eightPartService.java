package com.xch.interview.service;

import com.xch.interview.pojo.label;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Param;

/**
 * 八股分类标签
 * @author: xiongconghui
 * @date: 2023-05-08 14:11
 **/
public interface eightPartService {

   /**
    * 获取所有开放的八股文标签
    */
   BaseResult getAllLabel();

   /**
    * 获取所有八股文标签
    */
   BaseResult getLabels();

   /**
    * 改变八股文标签状态isActive
    */
   BaseResult changeModuleActive(label Label);


   /**
    *新增八股文标签
    */
   BaseResult addNewLable(label Label);

   /**
    *修改八股文标签
    */
   BaseResult EditLabel( label Label);
}
