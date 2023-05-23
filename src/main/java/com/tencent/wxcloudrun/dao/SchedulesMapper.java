package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Schedules;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface SchedulesMapper {
    void insert(@Param("Course_Id") String Course_Id, @Param("Course_Data") String Course_Data);
    void delete(@Param("Course_Id") String Course_Id, @Param("Course_Data") String Course_Data);
    ArrayList<Schedules> select(@Param("Course_Id") String Course_Id);
}
