package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Course implements Serializable {
    private String course_Id;
    private String course_Name;
    private String teacher_Id;
}
