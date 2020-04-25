package com.controller;

import com.github.pagehelper.PageInfo;
import com.pojo.QuarterPlan;
import com.service.IQuarterPlanService;
import com.utils.ResponseUtils;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/quarterPlan")
public class QuarterPlanController {

    @Autowired
    private IQuarterPlanService quarterPlanService;

    @GetMapping("/page")
    public PageInfo<QuarterPlan> queryAllPlan(@RequestParam("pageNum") Integer pageNum
            , @RequestParam("pageSize") Integer pageSize
            , @RequestParam("yearPlanId") Integer yearPlanId

    ) {
        return quarterPlanService.queryPlanList(pageNum, pageSize, yearPlanId);
    }

    @DeleteMapping("/removePlan")
    public ResultVO removePlan(@RequestParam(value = "planId") Integer planId) {
        quarterPlanService.removePlanById(planId);
        return ResultVOUtil.success();

    }

    @PostMapping("/addPlan")
    public ResultVO addPlan(@RequestBody QuarterPlan plan) {
        quarterPlanService.addPlan(plan);
        return ResultVOUtil.success();
    }

    @GetMapping("/getPlan")
    public ResultVO getPlan(@RequestParam(value = "planId") Integer planId) {
        QuarterPlan plan = quarterPlanService.getPlanById(planId);
        return ResultVOUtil.success(plan);
    }

    @PutMapping("/updatePlan")
    public ResultVO updatePlan(@RequestBody QuarterPlan plan) {
        quarterPlanService.updatePlan(plan);
        return ResultVOUtil.success();
    }

}