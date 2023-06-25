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
    private String memberId;

    /**
     * 技能成员名字
     */
    private String memberName;

    private int isOpen;


    public skillMember(String skillId, String memberId, String memberName, int isOpen) {
        this.skillId = skillId;
        this.memberId = memberId;
        this.memberName = memberName;
        this.isOpen = isOpen;
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
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(int isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        skillMember that = (skillMember) o;
        return isOpen == that.isOpen &&
                skillId.equals(that.skillId) &&
                memberId.equals(that.memberId) &&
                memberName.equals(that.memberName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, memberId, memberName, isOpen);
    }

    @Override
    public String toString() {
        return "skillMember{" +
                "skillId='" + skillId + '\'' +
                ", memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
