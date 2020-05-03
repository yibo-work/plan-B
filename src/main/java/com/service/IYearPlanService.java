package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.YearPlan;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface IYearPlanService {

    PageInfo<YearPlan> queryPlanList(Integer pageNum, Integer pageSize);

    int addPlan(YearPlan plan, HttpSession session);

    YearPlan getPlanById(Integer id);

    int updatePlan(YearPlan plan);

    int removePlanById(Integer id);

    List<YearPlan> getYearPlanList();
}
