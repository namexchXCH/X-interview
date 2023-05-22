package com.xch.interview.pojo;

import java.util.Objects;

/**
 * @ClassName: skill
 * @author: xiongconghui
 * @date: 2023-05-22 16:10
 **/
public class skill {

    /**
     * 技能唯一id
     */
   private String skillId;

    /**
     * 技能名字
     */
   private String skillName;

    /**
     * 是否开放 0不开放，1开放
     */
   private int isActive;

    public skill() {
    }

    public skill(String skillId, String skillName, int isActive) {
        this.skillId = skillId;
        this.skillName = skillName;
        this.isActive = isActive;
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "skill{" +
                "skillId='" + skillId + '\'' +
                ", skillName='" + skillName + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        skill skill = (skill) o;
        return isActive == skill.isActive &&
                skillId.equals(skill.skillId) &&
                skillName.equals(skill.skillName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, skillName, isActive);
    }
}
