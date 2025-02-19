package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Teacher;
import com.tencent.wxcloudrun.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    final TeacherService teacherService;

    public TeacherController(@Autowired TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/teacher/insert")
    ApiResponse insert(@RequestBody Teacher teacher) {
        teacherService.insert(teacher.getTeacher_Id(), teacher.getTeacher_Name());
        return ApiResponse.ok(0);
    }

    @PostMapping("/teacher/delete")
    ApiResponse delete(@RequestBody Teacher teacher) {
        teacherService.delete(teacher.getTeacher_Id());
        return ApiResponse.ok(0);
    }

    @PostMapping("/teacher/select")
    ApiResponse select() {
        return ApiResponse.ok(teacherService.select());
    }
}
