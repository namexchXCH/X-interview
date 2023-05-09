package com.xch.interview.pojo;

import java.util.Objects;

/**
 * @ClassName: eighTtitle
 * @author: xiongconghui
 * @date: 2023-05-08 13:58
 * 八股文题目id
 **/
public class eighTtitle {
    private String eighTtitleId;
    private String memberId;
    private String title;

    public eighTtitle() {
    }

    public eighTtitle(String eighTtitleId, String memberId, String title) {
        this.eighTtitleId = eighTtitleId;
        this.memberId = memberId;
        this.title = title;
    }

    public String getEighTtitleId() {
        return eighTtitleId;
    }

    public void setEighTtitleId(String eighTtitleId) {
        this.eighTtitleId = eighTtitleId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "eighTtitle{" +
                "eighTtitleId='" + eighTtitleId + '\'' +
                ", memberId='" + memberId + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        eighTtitle that = (eighTtitle) o;
        return eighTtitleId.equals(that.eighTtitleId) &&
                memberId.equals(that.memberId) &&
                title.equals(that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eighTtitleId, memberId, title);
    }
}
