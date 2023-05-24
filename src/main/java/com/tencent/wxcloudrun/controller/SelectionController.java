package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Schedules;
import com.tencent.wxcloudrun.model.Selection;
import com.tencent.wxcloudrun.service.SchedulesService;
import com.tencent.wxcloudrun.service.SelectionService;
import com.tencent.wxcloudrun.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SelectionController {
    final SelectionService selectionService;
    final SchedulesService schedulesService;
    final StateService stateService;

    public SelectionController(@Autowired SelectionService selectionService, @Autowired SchedulesService schedulesService, @Autowired StateService stateService) {
        this.selectionService = selectionService;
        this.schedulesService = schedulesService;
        this.stateService = stateService;
    }

    @PostMapping("/selection/insert")
    ApiResponse insert(@RequestBody Selection selection) {
        selectionService.insert(selection.getCourse_Id(), selection.getStudent_Id());
        ArrayList<Schedules> schedulesArrayList = schedulesService.select(selection.getCourse_Id());
        for(Schedules schedules: schedulesArrayList) {
            stateService.insert(selection.getStudent_Id(), selection.getCourse_Id(), schedules.getCourse_Date(), "present");
        }
        return ApiResponse.ok(0);
    }

    @PostMapping("/selection/delete")
    ApiResponse delete(@RequestBody Selection selection) {
        selectionService.delete(selection.getCourse_Id(), selection.getStudent_Id());
        ArrayList<Schedules> schedulesArrayList = schedulesService.select(selection.getCourse_Id());
        for(Schedules schedules: schedulesArrayList) {
            stateService.delete(selection.getStudent_Id(), selection.getCourse_Id(), schedules.getCourse_Date());
        }
        return ApiResponse.ok(0);
    }

    @PostMapping("/selection/select")
    ApiResponse select(@RequestBody Selection selection) {
        return ApiResponse.ok(selectionService.select(selection.getCourse_Id()));
    }
}
