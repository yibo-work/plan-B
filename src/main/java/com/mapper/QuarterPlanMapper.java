package com.mapper;

import com.pojo.QuarterPlan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface QuarterPlanMapper {

    List<QuarterPlan> queryPlanList(@Param("yearPlanId") Integer yearPlanId);

    int addPlan(@Param("plan") QuarterPlan plan);

    QuarterPlan getPlanById(@Param("id") Integer id);

    int updatePlan(@Param("plan") QuarterPlan plan);

    int removePlanById(@Param("id") Integer id);

}
