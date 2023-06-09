package com.xch.interview.controller;


import com.xch.interview.pojo.resourceTable;
import com.xch.interview.service.resourceService;
import com.xch.interview.utils.BaseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName: resourceController
 * @author: xiongconghui
 * @date: 2023-05-29 17:16
 **/

@RestController
public class resourceController {

    @Resource
    private resourceService resourceServiceimpl;


    /**
     * 获取工具库所有资源
     */
    @GetMapping("/interview/allresource")
    public BaseResult getAllresource(){
        return  resourceServiceimpl.getAllResource();
    }

    /**
     * 获取所有工具类别
     */
    @GetMapping("/interview/alltoolcategory")
    public BaseResult getAllToolCategory(){
        return  resourceServiceimpl.getAllToolCategory();
    }


    /**
     * 获取所类别对应下的工所有具
     */
    @GetMapping("/interview/tools")
    public BaseResult getTools(@RequestParam("toolNavigationId") String toolNavigationId){
        return  resourceServiceimpl.getTools(toolNavigationId);
    }


    /**
     * 改变资源工具状态 isActive为1 表示激活，0表示关闭
     */
    @GetMapping("/interview/changeactive")
    public BaseResult ChangeActive(@RequestParam("resourceId") String resourceId,
                                   @RequestParam("isActive") int isActive){
        return  resourceServiceimpl.ChangeActive(resourceId,isActive);
    }
    /**
     * 删除工具
     */
    @GetMapping("/interview/deletetool")
    public BaseResult deletetool(@RequestParam("resourceId") String resourceId){
        return  resourceServiceimpl.deletetool(resourceId);
    }

    /**
     * 编辑更新工具
     */
    @PostMapping("/interview/edittool")
    public BaseResult EditTool(@RequestBody resourceTable rTable){
        return  resourceServiceimpl.EditTool(rTable);
    }

    /**
     * 添加新工具
     */
    @PostMapping("/interview/addtool")
    public BaseResult AddTool(@RequestBody resourceTable rTable){
        return  resourceServiceimpl.AddTool(rTable);
    }

}
