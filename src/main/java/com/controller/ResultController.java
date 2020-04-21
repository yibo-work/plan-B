package com.controller;

import com.pojo.Result;
import com.service.IResultService;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private IResultService resultService;

    @PostMapping("/addResult")
    public ResultVO addResult(@RequestBody Result result) {
        resultService.addResult(result);
        return ResultVOUtil.success();
    }
}
