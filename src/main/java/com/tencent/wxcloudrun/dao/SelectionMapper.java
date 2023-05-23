package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.State;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface SelectionMapper {
    void insert(@Param("Course_Id") String Course_Id, @Param("Student_Id") String Student_Id);
    void delete(@Param("Course_Id") String Course_Id, @Param("Student_Id") String Student_Id);
    ArrayList<State> select(@Param("Course_Id") String Course_Id);
}
