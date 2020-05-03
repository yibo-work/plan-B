package com.mapper;

import com.pojo.Result;
import com.pojo.UserResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResultMapper {

    int addResult(@Param("result") Result result);

    List<UserResult> queryResultList(@Param("name") String name);

    List<Result> queryResultPage(@Param("customerId") Integer customerId);

    Result getResultById(@Param("resultId") Integer resultId);

    int updateResult(@Param("result") Result result);
}
