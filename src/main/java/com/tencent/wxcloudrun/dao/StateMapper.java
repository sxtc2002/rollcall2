package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.State;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface StateMapper {
    void insert(@Param("Student_Id") String Student_Id, @Param("Course_Id") String Course_Id, @Param("Course_Date") String Course_Date, @Param("Student_State") String Student_State);
    void update(@Param("Student_Id") String Student_Id, @Param("Course_Id") String Course_Id, @Param("Course_Date") String Course_Date, @Param("Student_State") String Student_State);
    void delete(@Param("Student_Id") String Student_Id, @Param("Course_Id") String Course_Id, @Param("Course_Date") String Course_Date);
    ArrayList<State> select_name(@Param("Student_Name") String Student_Name);
    ArrayList<State> select_state(@Param("Course_Id") String Course_Id, @Param("Course_Date") String Course_Date, @Param("Student_State") String Student_State);
}
