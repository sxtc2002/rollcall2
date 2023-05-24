package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Schedules;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface SchedulesMapper {
    void insert(@Param("course_Id") String course_Id, @Param("course_Date") String course_Date);
    void delete(@Param("course_Id") String course_Id, @Param("course_Date") String course_Date);
    ArrayList<Schedules> select(@Param("course_Id") String course_Id);
}
