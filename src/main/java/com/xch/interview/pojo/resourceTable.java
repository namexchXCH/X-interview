package com.xch.interview.pojo;

import java.util.Objects;

/**
 * @ClassName: resourceTable
 * @author: xiongconghui
 * @date: 2023-05-29 15:41
 **/
public class resourceTable {

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 属于哪类工具,工具类型id
     */
    private String toolNavigationId;

    /**
     * 资源介绍
     */
    private String introduce;

    /**
     * 资源图标链接
     */
    private String resourceIcon;

    /**
     * 资源名字
     */
    private String resourceName;

    /**
     * 资源网址链接
     */
    private String resourceUrl;

    /**
     * 该资源是否开放0不开放、1开放
     */
    private int isActive;

    public resourceTable() {
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getToolNavigationId() {
        return toolNavigationId;
    }

    public void setToolNavigationId(String toolNavigationId) {
        this.toolNavigationId = toolNavigationId;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getResourceIcon() {
        return resourceIcon;
    }

    public void setResourceIcon(String resourceIcon) {
        this.resourceIcon = resourceIcon;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }


    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "resourceTable{" +
                "resourceId='" + resourceId + '\'' +
                ", toolNavigationId='" + toolNavigationId + '\'' +
                ", introduce='" + introduce + '\'' +
                ", resourceIcon='" + resourceIcon + '\'' +
                ", resourceName='" + resourceName + '\'' +
                ", resourceUrl='" + resourceUrl + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        resourceTable that = (resourceTable) o;
        return isActive == that.isActive &&
                resourceId.equals(that.resourceId) &&
                toolNavigationId.equals(that.toolNavigationId) &&
                introduce.equals(that.introduce) &&
                resourceIcon.equals(that.resourceIcon) &&
                resourceName.equals(that.resourceName) &&
                resourceUrl.equals(that.resourceUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, toolNavigationId, introduce, resourceIcon, resourceName, resourceUrl, isActive);
    }
}
