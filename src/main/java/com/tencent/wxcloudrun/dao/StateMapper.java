package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.State;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface StateMapper {
    void insert(@Param("student_Id") String student_Id, @Param("course_Id") String course_Id, @Param("course_Date") String course_Date, @Param("student_State") String student_State);
    void update(@Param("student_Id") String student_Id, @Param("course_Id") String course_Id, @Param("course_Date") String course_Date, @Param("student_State") String student_State);
    void delete(@Param("student_Id") String student_Id, @Param("course_Id") String course_Id, @Param("course_Date") String course_Date);
    ArrayList<State> select_name(@Param("student_Name") String student_Name);
    ArrayList<State> select_state(@Param("course_Id") String course_Id, @Param("course_Date") String course_Date, @Param("student_State") String student_State);
    ArrayList<State> select_all(@Param("course_Id") String course_Id, @Param("course_Date") String course_Date);
}
