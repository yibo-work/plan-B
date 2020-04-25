package com.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Clrvn
 * @description null
 * @date 2020-04-22 01:00:21
 */
@Data
public class Result implements Serializable {

    private static final long serialVersionUID = 7163346269371180986L;

    private Integer id;
    private Integer resultId;

    private String sales;

    private String brand;

    private String status;

    private String group;

    private String earnings;

    private String range;

    private String problem;

    private Integer customerId;

    private String companyName;
    private String man;
    private String phone;
    private String address;
    private Integer planFlag;
    private Integer resultCount;

    private Integer execUserId;
    private Integer backCount;

    private String name;

    private String password;

    private String userPhone;
    private String execTime;
    private String customerName;

    private Integer monthId;

}
