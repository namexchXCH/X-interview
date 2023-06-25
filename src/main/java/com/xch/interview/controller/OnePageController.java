package com.xch.interview.controller;

import com.xch.interview.pojo.OnePage;
import com.xch.interview.service.OnePageService;
import com.xch.interview.utils.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: OnePageController
 * @author: xiongconghui
 * @date: 2023-06-24 15:22
 **/
@RestController
public class OnePageController {
    @Resource
    private OnePageService onePageServiceImpl;
    /**
     * 获取首页信息
     */
    @GetMapping("/interview/onepagedata")
   public BaseResult getOnePageData(){
       return onePageServiceImpl.getOnePageData();
   }


    /**
     * 编辑首页信息
     */
    @PutMapping("/interview/editonepagedata")
    public BaseResult editOnePageData(@RequestBody OnePage onePage){
        return onePageServiceImpl.editOnePageData(onePage);
    }
}
