package com.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @description 年计划
 * @author  Clrvn
 * @date 2020-04-19 18:17:03 
 */
@Data
public class YearPlan  implements Serializable {

	private static final long serialVersionUID =  2006613281293903085L;

	/**
	 * 主键自增id
	 */
	private Integer id;

	/**
	 * 计划时间
	 */
	private String execTime;

	/**
	 * 计划概述
	 */
	private String overview;

	/**
	 * 目前拜访情况
	 */
	private String situation;

	/**
	 * 计划目标
	 */
	private String target;

	/**
	 * 一级审批人id
	 */
	private Integer firstUserId;

	/**
	 * 一级审批人意见
	 */
	private String firstIdea;

	/**
	 * 二级审批人id
	 */
	private Integer secondUserId;

	/**
	 * 二级审批人意见
	 */
	private String secondIdea;

	/**
	 * 申请人id
	 */
	private Integer applyUserId;

	/**
	 * 审批状态
	 */
	private Integer status;

}
