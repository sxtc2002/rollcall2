package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface CourseMapper {
    void insert(@Param("course_Id") String course_Id, @Param("course_Name") String course_Name, @Param("teacher_Id") String teacher_Id);
    void delete(@Param("course_Id") String course_Id);
    ArrayList<Course> select();
}
