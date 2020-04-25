package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.MonthPlan;

public interface IMonthPlanService {

    PageInfo<MonthPlan> queryPlanList(Integer pageNum, Integer pageSize, Integer yearPlanId);

    int addPlan(MonthPlan plan);

    MonthPlan getPlanById(Integer id);

    int updatePlan(MonthPlan plan);

    int removePlanById(Integer id);

}
