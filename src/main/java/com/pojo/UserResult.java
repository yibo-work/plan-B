package com.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Clrvn
 * 客户经理拜访情况
 */
@Data
public class UserResult implements Serializable {

    private static final long serialVersionUID = 4L;

    private Integer id;

    private String name;

    private String yearPlanExecTime;

    private Integer shouldCount;


    private Integer realCount;

    public UserResult() {
        super();
    }

}
