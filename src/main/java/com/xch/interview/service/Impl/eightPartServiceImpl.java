package com.xch.interview.service.Impl;

import com.xch.interview.mapper.eightPartMapper;
import com.xch.interview.pojo.label;
import com.xch.interview.service.eightPartService;
import com.xch.interview.utils.BaseResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: eightPartServiceImpl
 * @author: xiongconghui
 * @date: 2023-05-08 14:12
 **/
@Service
public class eightPartServiceImpl implements eightPartService {

    @Resource
    private eightPartMapper eightpartMapper;
    @Override
    public BaseResult getAllLabel() {

        List<label> allLabel = eightpartMapper.getAllLabel();
        return BaseResult.ok(allLabel);
    }
}
