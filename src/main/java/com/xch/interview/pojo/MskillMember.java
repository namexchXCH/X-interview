package com.xch.interview.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

/**
 * @ClassName: MskillMember
 * @author: xiongconghui
 * @date: 2023-05-22 16:27
 **/
@Document(collection = "skillmember")
public class MskillMember {
    /**
     * 技能成员id
     */
    private String memberId;
    /**
     * 技能成员内容
     */
    private String memberText;


    public MskillMember(String memberId, String memberText) {
        this.memberId = memberId;
        this.memberText = memberText;
    }

    public MskillMember() {
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberText() {
        return memberText;
    }

    public void setMemberText(String memberText) {
        this.memberText = memberText;
    }

    @Override
    public String toString() {
        return "MskillMember{" +
                "memberId='" + memberId + '\'' +
                ", memberText='" + memberText + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MskillMember that = (MskillMember) o;
        return memberId.equals(that.memberId) &&
                memberText.equals(that.memberText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberText);
    }
}
