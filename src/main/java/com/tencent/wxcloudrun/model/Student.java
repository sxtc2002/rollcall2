package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private String student_Id;
    private String student_Name;
}
