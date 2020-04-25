package com.controller;

import com.github.pagehelper.PageInfo;
import com.pojo.MonthPlan;
import com.service.IMonthPlanService;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/monthPlan")
public class MonthPlanController {

    @Autowired
    private IMonthPlanService monthPlanService;

    @GetMapping("/page")
    public PageInfo<MonthPlan> queryAllPlan(@RequestParam("pageNum") Integer pageNum
            , @RequestParam("pageSize") Integer pageSize
            , @RequestParam("quarterPlanId") Integer quarterPlanId

    ) {
        return monthPlanService.queryPlanList(pageNum, pageSize, quarterPlanId);
    }

    @DeleteMapping("/removePlan")
    public ResultVO removePlan(@RequestParam(value = "planId") Integer planId) {
        monthPlanService.removePlanById(planId);
        return ResultVOUtil.success();

    }

    @PostMapping("/addPlan")
    public ResultVO addPlan(@RequestBody MonthPlan plan) {
        monthPlanService.addPlan(plan);
        return ResultVOUtil.success();
    }

    @GetMapping("/getPlan")
    public ResultVO getPlan(@RequestParam(value = "planId") Integer planId) {
        MonthPlan plan = monthPlanService.getPlanById(planId);
        return ResultVOUtil.success(plan);
    }

    @PutMapping("/updatePlan")
    public ResultVO updatePlan(@RequestBody MonthPlan plan) {
        monthPlanService.updatePlan(plan);
        return ResultVOUtil.success();
    }

}