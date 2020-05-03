package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.QuarterPlan;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface IQuarterPlanService {

    PageInfo<QuarterPlan> queryPlanList(Integer pageNum, Integer pageSize, Integer yearPlanId);

    int addPlan(QuarterPlan plan);

    QuarterPlan getPlanById(Integer id);

    int updatePlan(QuarterPlan plan);

    int removePlanById(Integer id);

    List<QuarterPlan> getQuarterPlanList(Integer yearPlanId);
}
