package com.xch.interview.pojo;

import java.util.Objects;

/**
 * @ClassName: label
 * 八股文标签类
 * @author: xiongconghui
 * @date: 2023-05-08 13:53
 **/
public class label {

    private String labelId;
    private String labelText;
    private int isActive;

    public label() {
    }

    public label(String labelId, String labelText, int isActive) {
        this.labelId = labelId;
        this.labelText = labelText;
        this.isActive = isActive;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getLabelText() {
        return labelText;
    }

    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "label{" +
                "labelId='" + labelId + '\'' +
                ", labelText='" + labelText + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        label label = (label) o;
        return isActive == label.isActive &&
                labelId.equals(label.labelId) &&
                labelText.equals(label.labelText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelId, labelText, isActive);
    }
}
