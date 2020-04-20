package com.mapper;

import com.pojo.YearPlan;
import com.pojo.YearPlan;
import com.vo.PlanVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface YearPlanMapper {

    List<YearPlan> queryPlanList();

    int addPlan(@Param("plan") YearPlan plan);

    YearPlan getPlanById(@Param("id") Integer id);

    int updatePlan(@Param("plan") YearPlan plan);

    int removePlanById(@Param("id") Integer id);

}
