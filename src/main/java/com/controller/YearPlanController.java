package com.controller;

import com.github.pagehelper.PageInfo;
import com.pojo.YearPlan;
import com.service.IYearPlanService;
import com.utils.ResponseUtils;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@RequestMapping("/yearPlan")
public class YearPlanController {

    @Autowired
    private IYearPlanService yearPlanService;

    @GetMapping("/page")
    public PageInfo<YearPlan> queryAllPlan(@RequestParam("pageNum") Integer pageNum
            , @RequestParam("pageSize") Integer pageSize
            
    ) {
        return yearPlanService.queryPlanList(pageNum, pageSize);
    }

    @RequestMapping("/getYearPlanList")
    public ResultVO getYearPlanList() {
        return ResultVOUtil.success(yearPlanService.getYearPlanList());
    }


    @DeleteMapping("/removePlan")
    public ResultVO removePlan(@RequestParam(value = "planId") Integer planId) {
        yearPlanService.removePlanById(planId);
        return ResultVOUtil.success();

    }

    @PostMapping("/addPlan")
    public ResultVO addPlan(@RequestBody YearPlan plan, HttpSession session) {
        yearPlanService.addPlan(plan, session);
        return ResultVOUtil.success();
    }

    @GetMapping("/getPlan")
    public ResultVO getPlan(@RequestParam(value = "planId") Integer planId) {
        YearPlan plan = yearPlanService.getPlanById(planId);
        return ResultVOUtil.success(plan);
    }

    @PutMapping("/updatePlan")
    public ResultVO updatePlan(@RequestBody YearPlan plan) {
        yearPlanService.updatePlan(plan);
        return ResultVOUtil.success();
    }

    /**
     * 下载拜访计划模板
     */
    @GetMapping("/downloadTemplate")
    public ResponseEntity<byte[]> downloadReport(@RequestParam("name") String name) throws IOException {
        return ResponseUtils.buildResponseEntity(name);
    }
}