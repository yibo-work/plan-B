package com.mapper;

import com.pojo.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ResultMapper {

    int addResult(@Param("result") Result result);

}
