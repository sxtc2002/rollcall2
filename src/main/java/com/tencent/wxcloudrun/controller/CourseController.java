package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Course;
import com.tencent.wxcloudrun.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CourseController {
    final CourseService courseService;

    public CourseController(@Autowired CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/course/insert")
    ApiResponse insert(@RequestBody Course course) {
        courseService.insert(course.getCourse_Id(), course.getCourse_Name(), course.getTeacher_Id());
        return ApiResponse.ok(0);
    }

    @PostMapping("/course/delete")
    ApiResponse delete(@RequestBody Course course) {
        courseService.delete(course.getCourse_Id());
        return ApiResponse.ok(0);
    }

    @PostMapping("/course/select")
    ApiResponse select() {
        return ApiResponse.ok(courseService.select());
    }
}
