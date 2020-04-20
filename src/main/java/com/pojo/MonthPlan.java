package com.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @description 月计划
 * @author  Clrvn
 * @date 2020-04-19 18:17:13 
 */
@Data
public class MonthPlan  implements Serializable {

	private static final long serialVersionUID =  6068792594797437541L;

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
	 * 客户id集合
	 */
	private String customerIds;

	/**
	 * 执行人id
	 */
	private Integer execUserId;

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
