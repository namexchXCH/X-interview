package com.xch.interview.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

/**
 * @ClassName: OnePage
 * @author: xiongconghui
 * @date: 2023-06-24 15:32
 **/
@Document(collection = "onepage")
public class OnePage {

        private String onePageId;

        private String onePageText;

    public OnePage() {
    }

    public OnePage(String onePageId, String onePageText) {
        this.onePageId = onePageId;
        this.onePageText = onePageText;
    }

    public String getOnePageId() {
        return onePageId;
    }

    public void setOnePageId(String onePageId) {
        this.onePageId = onePageId;
    }

    public String getOnePageText() {
        return onePageText;
    }

    public void setOnePageText(String onePageText) {
        this.onePageText = onePageText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnePage onePage = (OnePage) o;
        return onePageId.equals(onePage.onePageId) &&
                onePageText.equals(onePage.onePageText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(onePageId, onePageText);
    }

    @Override
    public String toString() {
        return "OnePage{" +
                "onePageId='" + onePageId + '\'' +
                ", onePageText='" + onePageText + '\'' +
                '}';
    }
}
