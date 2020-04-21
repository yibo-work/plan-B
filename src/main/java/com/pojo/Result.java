package com.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @description null
 * @author  Clrvn
 * @date 2020-04-22 01:00:21 
 */
@Data
public class Result  implements Serializable {

	private static final long serialVersionUID =  7163346269371180986L;

	private Integer id;

	private String sales;

	private String brand;

	private String status;

	private String group;

	private String earnings;

	private String range;

	private String problem;

	private Integer customerId;

}
