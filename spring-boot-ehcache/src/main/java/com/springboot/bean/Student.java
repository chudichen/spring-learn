package com.springboot.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 学生实体
 *
 * @author Michael Chu
 * @since 2020-02-29 14:48
 */
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = -5871112691729687726L;

    private String sno;
    private String name;
    private String sex;
}
