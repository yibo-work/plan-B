package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.Result;
import com.pojo.UserResult;

import javax.servlet.http.HttpSession;


public interface IResultService {
    int addResult(Result result, HttpSession session);
    int updateResult(Result result);

    PageInfo<UserResult> queryResultList(Integer pageNum, Integer pageSize, String name);

    PageInfo<Result> queryResultPage(Integer pageNum, Integer pageSize,Integer customerId);

    Result getResultById(Integer resultId);
}
