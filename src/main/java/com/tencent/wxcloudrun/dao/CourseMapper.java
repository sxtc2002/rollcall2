package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface CourseMapper {
    void insert(@Param("Course_Id") String Course_Id, @Param("Course_Name") String Course_Name, @Param("Teacher_Id") String Teacher_Id);
    void delete(@Param("Course_Id") String Course_Id);
    ArrayList<Course> select();
}
