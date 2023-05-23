package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class State implements Serializable {
    private String student_Id;
    private String course_Id;
    private String course_Date;
    private String student_State;
    private String student_Name;
}
