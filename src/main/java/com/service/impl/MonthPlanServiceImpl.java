package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.MonthPlanMapper;
import com.mapper.UserMapper;
import com.pojo.MonthPlan;
import com.service.IMonthPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonthPlanServiceImpl implements IMonthPlanService {

    @Autowired

    private MonthPlanMapper monthPlanMapper;

    @Override
    public PageInfo<MonthPlan> queryPlanList(Integer pageNum, Integer pageSize, Integer monthPlanId) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(monthPlanMapper.queryPlanList(monthPlanId));
    }

    @Override
    public int addPlan(MonthPlan plan) {
        return monthPlanMapper.addPlan(plan);
    }

    @Override
    public MonthPlan getPlanById(Integer id) {
        return monthPlanMapper.getPlanById(id);
    }

    @Override
    public int updatePlan(MonthPlan plan) {
        return monthPlanMapper.updatePlan(plan);
    }

    @Override
    public int removePlanById(Integer roomId) {
        return monthPlanMapper.removePlanById(roomId);
    }

}
