package com.controller;

import com.github.pagehelper.PageInfo;
import com.pojo.Result;
import com.pojo.UserResult;
import com.service.IResultService;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private IResultService resultService;

    @PostMapping("/addResult")
    public ResultVO addResult(@RequestBody Result result, HttpSession session) {
        resultService.addResult(result, session);
        return ResultVOUtil.success();
    }

    @PostMapping("/updateResult")
    public ResultVO updateResult(@RequestBody Result result) {
        resultService.updateResult(result);
        return ResultVOUtil.success();
    }

    @GetMapping("/resultPage")
    public PageInfo<Result> queryAllResult(@RequestParam("pageNum") Integer pageNum
            , @RequestParam("pageSize") Integer pageSize
            , @RequestParam(value = "customerId", required = false) Integer customerId
    ) {
        return resultService.queryResultPage(pageNum, pageSize, customerId);
    }


    @GetMapping("/page")
    public PageInfo<UserResult> queryUserResult(@RequestParam("pageNum") Integer pageNum
            , @RequestParam("pageSize") Integer pageSize
            , @RequestParam(required = false, name = "name") String name
    ) {
        return resultService.queryResultList(pageNum, pageSize, name);
    }

    @GetMapping("/getResult")
    public ResultVO getResult(@RequestParam(value = "resultId") Integer resultId) {
        Result result = resultService.getResultById(resultId);
        return ResultVOUtil.success(result);
    }
}
