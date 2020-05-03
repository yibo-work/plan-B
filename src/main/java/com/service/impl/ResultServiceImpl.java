package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.ResultMapper;
import com.pojo.Result;
import com.pojo.UserResult;
import com.service.IResultService;
import com.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class ResultServiceImpl implements IResultService {

    @Autowired
    private ResultMapper resultMapper;

    @Override
    public int addResult(Result result, HttpSession session) {
        UserVO userVO = (UserVO) session.getAttribute("USER");
        result.setExecUserId(userVO.getUser().getId());
        return resultMapper.addResult(result);
    }

    @Override
    public int updateResult(Result result) {
        return resultMapper.updateResult(result);
    }

    @Override
    public PageInfo<UserResult> queryResultList(Integer pageNum, Integer pageSize, String name) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(resultMapper.queryResultList(name));
    }

    @Override
    public PageInfo<Result> queryResultPage(Integer pageNum, Integer pageSize, Integer customerId) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(resultMapper.queryResultPage(customerId));
    }

    @Override
    public Result getResultById(Integer resultId) {
        return resultMapper.getResultById(resultId);
    }
}
