package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.YearPlan;
import com.pojo.YearPlan;
import com.vo.PlanVO;

public interface IYearPlanService {

    PageInfo<YearPlan> queryPlanList(Integer pageNum, Integer pageSize);

    int addPlan(YearPlan plan);

    YearPlan getPlanById(Integer id);

    int updatePlan(YearPlan plan);

    int removePlanById(Integer id);

}
