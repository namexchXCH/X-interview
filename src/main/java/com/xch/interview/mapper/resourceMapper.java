package com.xch.interview.mapper;

import com.xch.interview.pojo.resourceTable;
import com.xch.interview.pojo.resourceTool;
import com.xch.interview.pojo.toolNavigation;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName: resourceMapper
 * @author: xiongconghui
 * @date: 2023-05-29 16:47
 **/

@Mapper
@Component
public interface resourceMapper {

    /**
     * 获取工具库所有资源
     */
    List<resourceTool> getAllResource();

    /**
     * 获取所有工具类别
     */
    List<toolNavigation> getAllToolCategory();

    /**
     * 获取所类别对应下的工所有具
     */
    List<resourceTool> getTools( String toolNavigationId );

    /**
     * 改变资源工具状态 isActive为1 表示激活，0表示关闭
     */
   int ChangeActive(@Param("resourceId") String resourceId,@Param("isActive") int isActive);

    /**
     * 删除工具
     */
   int deletetool(@Param("resourceId") String resourceId);

    /**
     * 编辑更新工具
     */
   int EditTool(resourceTable rTable);

    /**
     * 添加新工具
     */
    int AddTool(resourceTable rTable);
}
