package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.Result;
import com.pojo.UserResult;

import javax.servlet.http.HttpSession;


public interface IResultService {
    int addResult(Result result, HttpSession session);

    PageInfo<UserResult> queryResultList(Integer pageNum, Integer pageSize, String name);

    PageInfo<Result> queryResultPage(Integer pageNum, Integer pageSize);

    Result getResultById(Integer resultId);
}
