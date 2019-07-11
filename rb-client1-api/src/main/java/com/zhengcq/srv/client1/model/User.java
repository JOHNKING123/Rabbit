package com.zhengcq.srv.client1.model;

import lombok.Data;

import java.util.Date;

@Data
public class User{

    private Long    id;

    private String name;

    private Integer age;

    private String nickName;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;
}
