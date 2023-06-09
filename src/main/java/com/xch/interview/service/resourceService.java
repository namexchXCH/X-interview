package com.xch.interview.service;

import com.xch.interview.pojo.resourceTable;
import com.xch.interview.pojo.resourceTool;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: resourceService
 * @author: xiongconghui
 * @date: 2023-05-29 19:54
 **/
public interface resourceService {

    /**
     * 获取工具库所有资源
     */
    BaseResult getAllResource();

    /**
     * 获取所有工具类别
     */
    BaseResult getAllToolCategory();

    /**
     * 获取所类别对应下的工所有具
     */
    BaseResult getTools( String toolNavigationId );

    /**
     * 改变资源工具状态 isActive为1 表示激活，0表示关闭
     */
    BaseResult ChangeActive( String resourceId,int isActive);


    /**
     * 删除工具
     */
    BaseResult deletetool( String resourceId);

    /**
     * 编辑更新工具
     */
    BaseResult EditTool(resourceTable rTable);

    /**
     * 添加新工具
     */
    BaseResult AddTool(resourceTable rTable);
}
