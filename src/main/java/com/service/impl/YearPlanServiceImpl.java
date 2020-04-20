package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.YearPlanMapper;
import com.pojo.YearPlan;
import com.service.IYearPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YearPlanServiceImpl implements IYearPlanService {

    @Autowired
    private YearPlanMapper yearPlanMapper;

    @Override
    public PageInfo<YearPlan> queryPlanList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(yearPlanMapper.queryPlanList());
    }

    @Override
    public int addPlan(YearPlan plan) {
        return yearPlanMapper.addPlan(plan);
    }

    @Override
    public YearPlan getPlanById(Integer id) {
        return yearPlanMapper.getPlanById(id);
    }

    @Override
    public int updatePlan(YearPlan plan) {
        return yearPlanMapper.updatePlan(plan);
    }

    @Override
    public int removePlanById(Integer roomId) {
        return yearPlanMapper.removePlanById(roomId);
    }

}
