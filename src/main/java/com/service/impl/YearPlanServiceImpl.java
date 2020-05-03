package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.UserMapper;
import com.mapper.YearPlanMapper;
import com.pojo.User;
import com.pojo.YearPlan;
import com.service.IYearPlanService;
import com.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class YearPlanServiceImpl implements IYearPlanService {

    @Autowired

    private YearPlanMapper yearPlanMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<YearPlan> queryPlanList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(yearPlanMapper.queryPlanList());
    }

    @Override
    public int addPlan(YearPlan plan, HttpSession session) {
        UserVO userVO = (UserVO) session.getAttribute("USER");
        User userByRoleId = userMapper.getUserByRoleId(4);
        plan.setApplyUserId(userVO.getUser().getId());
        plan.setFirstUserId(userByRoleId.getId());
        return yearPlanMapper.addPlan(plan);
    }

    @Override
    public YearPlan getPlanById(Integer id) {
        return yearPlanMapper.getPlanById(id);
    }

    @Override
    public int updatePlan(YearPlan plan) {
        return yearPlanMapper.updatePlan(plan);
    }

    @Override
    public int removePlanById(Integer roomId) {
        return yearPlanMapper.removePlanById(roomId);
    }

    @Override
    public List<YearPlan> getYearPlanList() {
        return yearPlanMapper.queryPlanList();
    }

}
