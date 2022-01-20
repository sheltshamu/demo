package com.example.demo.dto;

import com.example.demo.entity.Course;

public class CourseDto {
    private String code;
    private String name;
    private Long lecturerId;

    public CourseDto() {
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Long getLecturerId() {
        return lecturerId;
    }

    public static CourseDto of(Course course){
        CourseDto courseDto = new CourseDto();
        courseDto.code=course.getCode();
        courseDto.lecturerId=course.getLecturer().getId();
        courseDto.name=course.getName();
        return courseDto;
    }
}
