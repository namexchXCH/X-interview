package com.xch.interview.service.Impl;

import com.xch.interview.mapper.resourceMapper;
import com.xch.interview.pojo.resourceTable;
import com.xch.interview.pojo.resourceTool;
import com.xch.interview.pojo.toolNavigation;
import com.xch.interview.service.resourceService;
import com.xch.interview.utils.BaseResult;
import com.xch.interview.utils.SnowFlakeGenerateIdWorker;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: resourceServiceImpl
 * @author: xiongconghui
 * @date: 2023-05-29 19:55
 **/
@Service
public class resourceServiceImpl implements resourceService {

    @Resource
    private resourceMapper resourcemapper;

    /**
     * 获取工具库所有资源
     */
    @Override
    public BaseResult getAllResource() {
        List<resourceTool> allResource = resourcemapper.getAllResource();
        return BaseResult.ok(allResource);
    }

    /**
     * 获取所有工具类别
     */
    @Override
    public BaseResult getAllToolCategory() {
        List<toolNavigation> allToolCategory = resourcemapper.getAllToolCategory();
        return BaseResult.ok(allToolCategory);
    }

    /**
     * 获取所类别对应下的工所有具
     */
    @Override
    public BaseResult getTools(String toolNavigationId) {
        List<resourceTool> tools = resourcemapper.getTools(toolNavigationId);
        return BaseResult.ok(tools);
    }

    /**
     * 改变资源工具状态 isActive为1 表示激活，0表示关闭
     */
    @Override
    public BaseResult ChangeActive(String resourceId, int isActive) {
        int i = resourcemapper.ChangeActive(resourceId, isActive);
        if (i>0){
            return BaseResult.ok("ok");
        }else {
            return BaseResult.fail("no");
        }
    }

    /**
     * 删除工具
     */
    @Override
    public BaseResult deletetool(String resourceId) {
        System.out.println(resourceId);
        int deletetool = resourcemapper.deletetool(resourceId);
        if (deletetool > 0){
            return BaseResult.ok("ok");
        }else {
            return BaseResult.fail("no");
        }
    }


    /**
     * 编辑更新工具
     */
    @Override
    public BaseResult EditTool(resourceTable rTable) {
        int i = resourcemapper.EditTool(rTable);
        if (i > 0){
            return BaseResult.ok("ok");
        }else {
            return BaseResult.fail("no");
        }
    }

    /**
     * 添加新工具
     */
    @Override
    public BaseResult AddTool(resourceTable rTable) {

        SnowFlakeGenerateIdWorker snowFlakeGenerateIdWorker = new SnowFlakeGenerateIdWorker(0L,0L);
//        设置id
        String Id = snowFlakeGenerateIdWorker.generateNextId();
        rTable.setResourceId(Id);
        int i = resourcemapper.AddTool(rTable);
        if (i > 0){
            return BaseResult.ok(rTable);
        }else {
            return BaseResult.fail("no");
        }
    }
}
