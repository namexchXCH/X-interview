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
    private String MemberId;
    /**
     * 技能成员内容
     */
    private String MemberText;

    public MskillMember(String memberId, String memberText) {
        MemberId = memberId;
        MemberText = memberText;
    }

    public MskillMember() {
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getMemberText() {
        return MemberText;
    }

    public void setMemberText(String memberText) {
        MemberText = memberText;
    }

    @Override
    public String toString() {
        return "MskillMember{" +
                "MemberId='" + MemberId + '\'' +
                ", MemberText='" + MemberText + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MskillMember that = (MskillMember) o;
        return MemberId.equals(that.MemberId) &&
                MemberText.equals(that.MemberText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MemberId, MemberText);
    }
}
