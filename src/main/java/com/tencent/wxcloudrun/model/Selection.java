package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Selection implements Serializable {
    private String course_Id;
    private String student_Id;
}
