package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {
    private String teacher_Id;
    private String teacher_Name;
}
