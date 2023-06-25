package com.xch.interview.service;

import com.xch.interview.pojo.MskillMember;
import com.xch.interview.pojo.skill;
import com.xch.interview.pojo.skillMember;
import com.xch.interview.utils.BaseResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName: skillService
 * @author: xiongconghui
 * @date: 2023-05-22 16:55
 **/
public interface skillService {

  /**
   * 获取所有开放的技能
   */
  BaseResult getAllSkill();

  /**
   * 获取所有技能
   */
  BaseResult getAllToSkill();

  BaseResult getAllskillMember(String skillId );

  BaseResult getskillMemberAnswer(String memberId);

  /**
   * 获取对应技能下member总数
   */
  BaseResult getSkillMemberNum( String skillId );

  /**
   * 获取对应技能下分页每页member数据
   */
  BaseResult getSkillMemberPage( String skillId, int pageNum );


  /**
   * 更改技能题目
   */
  BaseResult changeSkillMenberTitle(skillMember skillmember);

  /**
   * 更改技能题目是否开放
   */
  BaseResult changeSkillMenberOpen(skillMember skillmember);

  /**
   * 更改技能题目文章内容
   */
  BaseResult exitMemberText(MskillMember mskillMember);

  /**
   * 删除技能题目文章内容
   */
  BaseResult DeleteSkillMemberText(String memberId) ;


  /**
   * 技能标签开关
   */
  BaseResult changeSkillIsopem( skill myskill);

  /**
   * 添加模块题目
   */
 BaseResult addSkillSember(skillMember skillmember);


  /**
   * 添加技能标签
   */
  BaseResult addSkill( skill myskill);

  /**
   * 更改标签名字
   */
  BaseResult editSkillName(skill myskill);

  /**
   * 删除标签
   */
  BaseResult deleteSkillById( String skillId);


}
