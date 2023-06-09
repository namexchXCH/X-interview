package com.xch.interview.pojo;

import java.util.List;
import java.util.Objects;

/**
 * @ClassName: resourceTool
 * @author: xiongconghui
 * @date: 2023-05-29 16:44
 **/
public class resourceTool {

    /**
     * 工具类型id
     */
    private String toolNavigationId ;

    /**
     * 工具类型图标链接
     */
    private String toolNavigationIcon;

    /**
     * 工具类型名称
     */
    private String toolNavigationNmae ;

    /**
     * 该工具类型是否开放0不开放、1开放
     */
    private int isOpen;

    /**
     * 该工具类型下所有资源
     */
    private List<resourceTable> allResource;

    public resourceTool() {
    }

    public String getToolNavigationId() {
        return toolNavigationId;
    }

    public void setToolNavigationId(String toolNavigationId) {
        this.toolNavigationId = toolNavigationId;
    }

    public String getToolNavigationIcon() {
        return toolNavigationIcon;
    }

    public void setToolNavigationIcon(String toolNavigationIcon) {
        this.toolNavigationIcon = toolNavigationIcon;
    }

    public String getToolNavigationNmae() {
        return toolNavigationNmae;
    }

    public void setToolNavigationNmae(String toolNavigationNmae) {
        this.toolNavigationNmae = toolNavigationNmae;
    }

    public int getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(int isOpen) {
        this.isOpen = isOpen;
    }

    public List<resourceTable> getAllResource() {
        return allResource;
    }

    public void setAllResource(List<resourceTable> allResource) {
        this.allResource = allResource;
    }

    @Override
    public String toString() {
        return "resourceTool{" +
                "toolNavigationId='" + toolNavigationId + '\'' +
                ", toolNavigationIcon='" + toolNavigationIcon + '\'' +
                ", toolNavigationNmae='" + toolNavigationNmae + '\'' +
                ", isOpen=" + isOpen +
                ", allResource=" + allResource +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        resourceTool that = (resourceTool) o;
        return isOpen == that.isOpen &&
                toolNavigationId.equals(that.toolNavigationId) &&
                toolNavigationIcon.equals(that.toolNavigationIcon) &&
                toolNavigationNmae.equals(that.toolNavigationNmae) &&
                allResource.equals(that.allResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toolNavigationId, toolNavigationIcon, toolNavigationNmae, isOpen, allResource);
    }
}
