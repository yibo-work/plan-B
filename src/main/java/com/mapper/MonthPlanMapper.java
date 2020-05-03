package com.mapper;

import com.pojo.MonthPlan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MonthPlanMapper {

    List<MonthPlan> queryPlanList(@Param("quarterPlanId") Integer quarterPlanId);

    int addPlan(@Param("plan") MonthPlan plan);

    MonthPlan getPlanById(@Param("id") Integer id);

    int updatePlan(@Param("plan") MonthPlan plan);

    int removePlanById(@Param("id") Integer id);

}
