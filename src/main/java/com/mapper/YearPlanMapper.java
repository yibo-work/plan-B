package com.mapper;

import com.pojo.YearPlan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface YearPlanMapper {

    List<YearPlan> queryPlanList();
    List<YearPlan> queryUsefullPlanList();

    int addPlan(@Param("plan") YearPlan plan);

    YearPlan getPlanById(@Param("id") Integer id);

    int updatePlan(@Param("plan") YearPlan plan);

    int removePlanById(@Param("id") Integer id);

}
