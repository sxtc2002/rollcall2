package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface TeacherMapper {
    void insert(@Param("teacher_Id") String teacher_Id, @Param("teacher_Name") String teacher_Name);
    void delete(@Param("teacher_Id") String teacher_Id);
    ArrayList<Teacher> select();
}
