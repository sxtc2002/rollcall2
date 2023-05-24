package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface StudentMapper {
    void insert(@Param("student_Id") String student_Id, @Param("student_Name") String student_Name);
    void delete(@Param("student_Id") String student_Id);
    ArrayList<Student> select();
}
