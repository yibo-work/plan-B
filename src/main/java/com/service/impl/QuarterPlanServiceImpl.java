package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.QuarterPlanMapper;
import com.mapper.UserMapper;
import com.pojo.QuarterPlan;
import com.pojo.User;
import com.service.IQuarterPlanService;
import com.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class QuarterPlanServiceImpl implements IQuarterPlanService {

    @Autowired

    private QuarterPlanMapper yearPlanMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<QuarterPlan> queryPlanList(Integer pageNum, Integer pageSize, Integer yearPlanId) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(yearPlanMapper.queryPlanList(yearPlanId));
    }

    @Override
    public int addPlan(QuarterPlan plan) {
        return yearPlanMapper.addPlan(plan);
    }

    @Override
    public QuarterPlan getPlanById(Integer id) {
        return yearPlanMapper.getPlanById(id);
    }

    @Override
    public int updatePlan(QuarterPlan plan) {
        return yearPlanMapper.updatePlan(plan);
    }

    @Override
    public int removePlanById(Integer roomId) {
        return yearPlanMapper.removePlanById(roomId);
    }

}
