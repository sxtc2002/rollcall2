package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface CourseService {
    void insert(String Course_Id, String Course_Name, String Teacher_Id);
    void delete(String Course_Id);

    ArrayList<Course> select();
}
