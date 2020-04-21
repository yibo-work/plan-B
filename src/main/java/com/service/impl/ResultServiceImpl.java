package com.service.impl;

import com.mapper.ResultMapper;
import com.pojo.Result;
import com.service.IResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements IResultService {

    @Autowired
    private ResultMapper resultMapper;

    @Override
    public int addResult(Result result) {
        return resultMapper.addResult(result);
    }
}
