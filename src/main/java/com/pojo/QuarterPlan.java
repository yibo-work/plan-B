package com.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @description 季度计划
 * @author  Clrvn
 * @date 2020-04-19 18:17:08 
 */
@Data
public class QuarterPlan  implements Serializable {

	private static final long serialVersionUID =  1096029718927259893L;

	private Integer id;

	private String execTime;

	private String overview;

	private String target;

	private Integer yearPlanId;

}
