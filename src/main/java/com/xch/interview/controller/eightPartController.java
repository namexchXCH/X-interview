package com.xch.interview.controller;

import com.xch.interview.pojo.label;
import com.xch.interview.service.QiniuOSSService;
import com.xch.interview.service.eightPartService;
import com.xch.interview.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @ClassName: eightPartController
 * @author: xiongconghui
 * @date: 2023-05-08 14:10
 **/
@RestController
@ResponseBody
public class eightPartController {

//    @Autowired
//    private QiniuOSSService qiniuOSSService;
    @Autowired
    private eightPartService eightpartserviceImpl;
    /**
     * 获取所有开放的八股文标签
     */
    @GetMapping("/interview/eightalllabel")
    public BaseResult getAllLabel(){
        return  eightpartserviceImpl.getAllLabel();
    }

    /**
     * 获取所有八股文标签
     */
    @GetMapping("/interview/eightlabel")
    public BaseResult getLabels(){
        return  eightpartserviceImpl.getLabels();
    }


    /**
     * 改变八股文标签状态isActive
     */
    @PutMapping("/interview/changemoduleactive")
    public BaseResult changeModuleActive(@RequestBody label Label){
        return  eightpartserviceImpl.changeModuleActive(Label);
    }


    /**
     *新增八股文标签
     */
    @PostMapping("/interview/addnewlable")
    public BaseResult addNewLable(@RequestBody label Label){
        return  eightpartserviceImpl.addNewLable(Label);
    }


    /**
     *修改八股文标签
     */
    @PutMapping("/interview/editLabel")
    public BaseResult EditLabel(@RequestBody label Label){
        return  eightpartserviceImpl.EditLabel(Label);
    }


//    @PostMapping("/interview/fils")
//    public BaseResult upload(@RequestParam("file") MultipartFile file,@RequestParam("filename") String fileName){
//        String upload = qiniuOSSService.upload(file,"interview1/"+fileName);
//        return BaseResult.ok(upload) ;
//    }



}
