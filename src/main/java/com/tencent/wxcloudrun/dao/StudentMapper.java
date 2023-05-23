package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface StudentMapper {
    void insert(@Param("Student_Id") String Student_Id, @Param("Student_Name") String Student_Name);
    void delete(@Param("Student_Id") String Student_Id);
    ArrayList<Student> select();
}
