package com.example.demo.dto;

import com.example.demo.entity.Course;

public class CourseDto {
    private String code;
    private String name;

    public CourseDto() {
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


    public static CourseDto of(Course course){
        CourseDto courseDto = new CourseDto();
        courseDto.code=course.getCode();
        courseDto.name=course.getName();
        return courseDto;
    }
}
