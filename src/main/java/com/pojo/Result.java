package com.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Clrvn
 * @date 2020-04-19 17:23:34
 */
@Data
public class Result implements Serializable {

    private static final long serialVersionUID = 6446745856125678926L;

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
