package com.xch.interview.service;

import com.xch.interview.pojo.OnePage;
import com.xch.interview.utils.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @ClassName: OnePageService
 * @author: xiongconghui
 * @date: 2023-06-24 15:24
 **/
public interface OnePageService {

    /**
     * 获取首页信息
     */

    BaseResult getOnePageData();


    /**
     * 编辑首页信息
     */
   BaseResult editOnePageData(OnePage onePage);
}
