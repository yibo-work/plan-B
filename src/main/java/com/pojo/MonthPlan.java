package com.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Clrvn
 * @description 月计划
 * @date 2020-04-19 18:17:13
 */
@Data
public class MonthPlan implements Serializable {

    private static final long serialVersionUID = 6068792594797437541L;

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 计划时间
     */
    private String execTime;

    /**
     * 计划目标
     */
    private String target;

    /**
     * 客户id
     */
    private String customerIds;
    private String customerList;


    /**
     * 执行人id
     */
    private Integer execUserId;
    /**
     * 执行人电话
     */
    private String execUserPhone;

    /**
     * 备注
     */
    private String remark;

    /**
     * 拜访方式
     */
    private String methods;

    /**
     * 季度计划id
     */
    private Integer quarterPlanId;

}
