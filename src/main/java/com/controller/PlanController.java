package com.controller;

import com.github.pagehelper.PageInfo;
import com.pojo.Plan;
import com.service.IPlanService;
import com.utils.ResponseUtils;
import com.utils.ResultVOUtil;
import com.vo.PlanVO;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/plan")
public class PlanController {

    @Autowired
    private IPlanService planService;

    @GetMapping("/page")
    public PageInfo<PlanVO> queryAllPlan(@RequestParam("pageNum") Integer pageNum
            , @RequestParam("pageSize") Integer pageSize
            , @RequestParam(required = false, name = "status") Integer status
            , @RequestParam(required = false, name = "type") Integer type
            , @RequestParam(required = false, name = "execTime") String execTime
            , @RequestParam(required = false, name = "companyName") String companyName
    ) {
        return planService.queryPlanList(pageNum, pageSize, status, type, execTime, companyName);
    }

    @DeleteMapping("/removePlan")
    public ResultVO removePlan(@RequestParam(value = "planId") Integer planId) {
        planService.removePlanById(planId);
        return ResultVOUtil.success();

    }

    @PostMapping("/addPlan")
    public ResultVO addPlan(@RequestBody Plan plan) {
        planService.addPlan(plan);
        return ResultVOUtil.success();
    }

    @GetMapping("/getPlan")
    public ResultVO getPlan(@RequestParam(value = "planId") Integer planId) {
        PlanVO plan = planService.getPlanById(planId);
        return ResultVOUtil.success(plan);
    }

    @PutMapping("/updatePlan")
    public ResultVO updatePlan(@RequestBody Plan plan) {
        planService.updatePlan(plan);
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