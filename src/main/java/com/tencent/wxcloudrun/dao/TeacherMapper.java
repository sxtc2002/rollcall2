package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface TeacherMapper {
    void insert(@Param("Teacher_Id") String Teacher_Id, @Param("Teacher_Name") String Teacher_Name);
    void delete(@Param("Teacher_Id") String Teacher_Id);
    ArrayList<Teacher> select();
}
