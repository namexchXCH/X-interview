package com.xch.interview.pojo;

import java.util.Objects;

/**
 * @ClassName: skillMember
 * @author: xiongconghui
 * @date: 2023-05-22 16:13
 **/
public class skillMember {
    /**
     * 技能唯一id
     */
    private String skillId;

    /**
     * 技能成员id
     */
    private String MemberId;

    /**
     * 技能成员名字
     */
    private String MemberName;

    public skillMember(String skillId, String memberId, String memberName) {
        this.skillId = skillId;
        MemberId = memberId;
        MemberName = memberName;
    }

    public skillMember() {
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    @Override
    public String toString() {
        return "skillMember{" +
                "skillId='" + skillId + '\'' +
                ", MemberId='" + MemberId + '\'' +
                ", MemberName='" + MemberName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        skillMember that = (skillMember) o;
        return skillId.equals(that.skillId) &&
                MemberId.equals(that.MemberId) &&
                MemberName.equals(that.MemberName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, MemberId, MemberName);
    }
}
