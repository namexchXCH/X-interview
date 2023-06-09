package com.xch.interview.pojo;

import java.util.Objects;

/**
 * @ClassName: toolNavigation
 * @author: xiongconghui
 * @date: 2023-05-29 15:37
 **/
public class toolNavigation {

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

    public toolNavigation() {
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

    @Override
    public String toString() {
        return "toolNavigation{" +
                "toolNavigationId='" + toolNavigationId + '\'' +
                ", toolNavigationIcon='" + toolNavigationIcon + '\'' +
                ", toolNavigationNmae='" + toolNavigationNmae + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        toolNavigation that = (toolNavigation) o;
        return isOpen == that.isOpen &&
                toolNavigationId.equals(that.toolNavigationId) &&
                toolNavigationIcon.equals(that.toolNavigationIcon) &&
                toolNavigationNmae.equals(that.toolNavigationNmae);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toolNavigationId, toolNavigationIcon, toolNavigationNmae, isOpen);
    }
}
