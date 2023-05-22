package com.xch.interview.service;

import com.xch.interview.utils.BaseResult;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: skillService
 * @author: xiongconghui
 * @date: 2023-05-22 16:55
 **/
public interface skillService {

  BaseResult getAllSkill();

  BaseResult getAllskillMember(String skillId );

  BaseResult getskillMemberAnswer(String memberId);
}
