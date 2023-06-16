package com.xch.interview.service.Impl;

import com.xch.interview.mapper.eightPartMapper;
import com.xch.interview.pojo.label;
import com.xch.interview.service.eightPartService;
import com.xch.interview.utils.BaseResult;
import com.xch.interview.utils.SnowFlakeGenerateIdWorker;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 八股分类标签
 * @author: xiongconghui
 * @date: 2023-05-08 14:12
 **/
@Service
public class eightPartServiceImpl implements eightPartService {

    @Resource
    private eightPartMapper eightpartMapper;


    /**
     * 获取所有开放的八股文标签
     */
    @Override
    public BaseResult getAllLabel() {

        List<label> allLabel = eightpartMapper.getAllLabel();
        if (allLabel.size()<1){
            return BaseResult.fail("暂时还没有内容！");
        }
        return BaseResult.ok(allLabel);
    }

    /**
     * 获取所有八股文标签
     */
    @Override
    public BaseResult getLabels() {
        List<label> labels = eightpartMapper.getLabels();
        return BaseResult.ok(labels);
    }

    @Override
    public BaseResult changeModuleActive(label Label) {
        int i = eightpartMapper.changeModuleActive(Label);
        if (i>0){
            return BaseResult.ok("ok");
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult addNewLable(label Label) {
        SnowFlakeGenerateIdWorker snowFlakeGenerateIdWorker = new SnowFlakeGenerateIdWorker(0L,0L);
//        设置id
        String Id = snowFlakeGenerateIdWorker.generateNextId();
        Label.setLabelId(Id);
        Label.setIsActive(0);
        int i = eightpartMapper.addNewLable(Label);
        if (i>0){
            return BaseResult.ok(Label);
        }
        return BaseResult.fail("fail");
    }

    @Override
    public BaseResult EditLabel(label Label) {
        int i = eightpartMapper.EditLabel(Label);
        if (i>0){
            return BaseResult.ok("ok");
        }
        return BaseResult.fail("fail");
    }
}
