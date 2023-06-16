package com.xch.interview.pojo;

import java.util.Objects;

/**
 * @ClassName: label
 * 八股文每个模块类
 * @author: xiongconghui
 * @date: 2023-05-08 13:49
 **/
public class member {

    private String labelId;
    private String memberId;
    private String memberTitle;
    private String introduce;
    private String coverUrl;
    private int readerNumber = 0;
    private int isMemberRequired = 0;
    private int isActive = 0;

    public member() {
    }

    public member(String labelId, String memberId, String memberTitle, String introduce, String coverUrl, int readerNumber, int isMemberRequired, int isActive) {
        this.labelId = labelId;
        this.memberId = memberId;
        this.memberTitle = memberTitle;
        this.introduce = introduce;
        this.coverUrl = coverUrl;
        this.readerNumber = readerNumber;
        this.isMemberRequired = isMemberRequired;
        this.isActive = isActive;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberTitle() {
        return memberTitle;
    }

    public void setMemberTitle(String memberTitle) {
        this.memberTitle = memberTitle;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public int getReaderNumber() {
        return readerNumber;
    }

    public void setReaderNumber(int readerNumber) {
        this.readerNumber = readerNumber;
    }

    public int getIsMemberRequired() {
        return isMemberRequired;
    }

    public void setIsMemberRequired(int isMemberRequired) {
        this.isMemberRequired = isMemberRequired;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "member{" +
                "labelId='" + labelId + '\'' +
                ", memberId='" + memberId + '\'' +
                ", memberTitle='" + memberTitle + '\'' +
                ", introduce='" + introduce + '\'' +
                ", coverUrl='" + coverUrl + '\'' +
                ", readerNumber=" + readerNumber +
                ", isMemberRequired=" + isMemberRequired +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        member member = (member) o;
        return readerNumber == member.readerNumber &&
                isMemberRequired == member.isMemberRequired &&
                isActive == member.isActive &&
                labelId.equals(member.labelId) &&
                memberId.equals(member.memberId) &&
                memberTitle.equals(member.memberTitle) &&
                introduce.equals(member.introduce) &&
                coverUrl.equals(member.coverUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelId, memberId, memberTitle, introduce, coverUrl, readerNumber, isMemberRequired, isActive);
    }
}
