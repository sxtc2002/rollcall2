package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Schedules;
import com.tencent.wxcloudrun.service.SchedulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulesController {
    final SchedulesService schedulesService;

    public SchedulesController(@Autowired SchedulesService schedulesService) {
        this.schedulesService = schedulesService;
    }

    @PostMapping("/schedules/insert")
    ApiResponse insert(@RequestBody Schedules schedules) {
        schedulesService.insert(schedules.getCourse_Id(), schedules.getCourse_Date());
        return ApiResponse.ok(0);
    }

    @PostMapping("/schedules/delete")
    ApiResponse delete(@RequestBody Schedules schedules) {
        schedulesService.delete(schedules.getCourse_Id(), schedules.getCourse_Date());
        return ApiResponse.ok(0);
    }

    @PostMapping("/schedules/select")
    ApiResponse select(@RequestBody Schedules schedules) {
        return ApiResponse.ok(schedulesService.select(schedules.getCourse_Id()));
    }
}
