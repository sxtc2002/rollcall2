package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.State;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface SelectionMapper {
    void insert(@Param("course_Id") String course_Id, @Param("student_Id") String student_Id);
    void delete(@Param("course_Id") String course_Id, @Param("student_Id") String student_Id);
    ArrayList<State> select(@Param("course_Id") String course_Id);
}
