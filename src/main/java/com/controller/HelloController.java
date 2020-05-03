package com.controller;

import com.pojo.Role;
import com.pojo.User;
import com.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Clrvn
 */
@Controller
public class HelloController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("loginOut")
    public String loginOut(HttpSession session) {
        session.removeAttribute("USER");
        session.invalidate();
        session.getServletContext().removeAttribute(session.getId());
        return "login";
    }

    @GetMapping("/index")
    public String index(HttpSession session, Model model) {
        //默认，不用登录
        UserVO user2 = new UserVO();
        User user = new User();
        user.setId(1);
        user.setName("chen");
        user.setPassword("123qwe");
        user.setRoleId(4);

        user2.setUser(user);
        Role role = new Role();
        role.setId(1);
        role.setName("管理员");
        role.setAuths("客户信息管理,客户拜访计划定制,客户拜访统计,客户拜访计划执行,年计划页,后台管理");

        user2.setRole(role);

        // 测试时取消前三行，加上后三行注释

        /*session.setAttribute("USER", user2);
        model.addAttribute("auths", user2.getRole().getAuths());
        return "index";*/


        UserVO userVo = (UserVO) session.getAttribute("USER");
        model.addAttribute("auths", userVo.getRole().getAuths());
        return "index";


    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }


    /**
     * 下载拜访计划模板
     */
    @GetMapping("/planTemplateManage")
    public String planTemplateManage() {
        return "planTemplateManage";
    }

    @GetMapping("/customerManage")
    public String customerManage() {
        return "customerManage";
    }

    @GetMapping("/customerUpdate")
    public String customerUpdate() {
        return "customerUpdate";
    }

    @GetMapping("/customerAdd")
    public String customerAdd() {
        return "customerAdd";
    }

    /**
     * MONTH
     */
    @GetMapping("/monthPlanManage")
    public String monthPlanManage() {
        return "monthPlanManage";
    }

    @GetMapping("/monthPlanUpdate")
    public String monthPlanUpdate() {
        return "monthPlanUpdate";
    }

    @GetMapping("/monthPlanAdd")
    public String monthPlanAdd() {
        return "monthPlanAdd";
    }

    /**
     * QUARTER
     */
    @GetMapping("/quarterPlanManage")
    public String quarterPlanManage() {
        return "quarterPlanManage";
    }

    @GetMapping("/quarterPlanUpdate")
    public String quarterPlanUpdate() {
        return "quarterPlanUpdate";
    }

    @GetMapping("/quarterPlanAdd")
    public String quarterPlanAdd() {
        return "quarterPlanAdd";
    }

    /**
     * YEAR
     */
    @GetMapping("/yearPlanManage")
    public String yearPlanManage() {
        return "yearPlanManage";
    }

    @GetMapping("/yearPlanUpdate")
    public String yearPlanUpdate() {
        return "yearPlanUpdate";
    }

    @GetMapping("/yearPlanAdd")
    public String yearPlanAdd() {
        return "yearPlanAdd";
    }

    /**
     * 用户管理
     */
    @GetMapping("/userManage")
    public String userManage() {
        return "userManage";
    }

    @GetMapping("/userAdd")
    public String userAdd() {
        return "userAdd";
    }

    @GetMapping("/userUpdate")
    public String userUpdate() {
        return "userUpdate";
    }

    /**
     * 角色管理
     */
    @GetMapping("/roleManage")
    public String roleManage() {
        return "roleManage";
    }

    @GetMapping("/roleUpdate")
    public String roleUpdate() {
        return "roleUpdate";
    }

    /**
     * 拜访结果记录
     */
    @GetMapping("/resultAdd")
    public String resultAdd() {
        return "resultAdd";
    }

    /**
     * 年计划详情
     */
    @GetMapping("/yearPlanView")
    public String yearPlanView() {
        return "yearPlanView";
    }

    /**
     * 年计划审批
     */
    @GetMapping("/yearPlanApprove")
    public String yearPlanApprove() {
        return "yearPlanApprove";
    }

    /**
     * 季度计划详情
     */
    @GetMapping("/quarterPlanView")
    public String quarterPlanView() {
        return "quarterPlanView";
    }

    /**
     * 月计划详情
     */
    @GetMapping("/monthPlanView")
    public String monthPlanView() {
        return "monthPlanView";
    }

    /**
     * 无预约客户统计
     */
    @GetMapping("/customerNoResult")
    public String customerNoResult() {
        return "customerNoResult";
    }

    /**
     * 无预约客户统计
     */
    @GetMapping("/customerResult")
    public String customerResult() {
        return "customerResult";
    }

    /**
     * 客户经理拜访情况统计
     */
    @GetMapping("/userResult")
    public String userResult() {
        return "userResult";
    }

    /**
     * 反馈详情
     */
    @GetMapping("/resultView")
    public String resultView() {
        return "resultView";
    }

    /**
     * 修改反馈记录
     */
    @GetMapping("/resultUpdate")
    public String resultUpdate() {
        return "resultUpdate";
    }

    /**
     * 添加拜访记录
     */
    @GetMapping("/resultManage")
    public String resultManage() {
        return "resultManage";
    }

    /**
     * 客户列表
     */
    @GetMapping("/customerList")
    public String customerList() {
        return "customerList";
    }

}
