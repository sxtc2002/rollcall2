package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.SchedulesMapper;
import com.tencent.wxcloudrun.model.Schedules;
import com.tencent.wxcloudrun.service.SchedulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SchedulesServiceImpl implements SchedulesService {
    final SchedulesMapper schedulesMapper;

    public SchedulesServiceImpl(@Autowired SchedulesMapper schedulesMapper) {
        this.schedulesMapper = schedulesMapper;
    }

    @Override
    public void insert(String Course_Id, String Course_Date) {
        schedulesMapper.insert(Course_Id, Course_Date);
    }

    @Override
    public void delete(String Course_Id, String Course_Date) {
        schedulesMapper.delete(Course_Id, Course_Date);
    }

    @Override
    public ArrayList<Schedules> select(String Course_Id) {
        return schedulesMapper.select(Course_Id);
    }
}
