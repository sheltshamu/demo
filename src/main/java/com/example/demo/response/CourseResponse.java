package com.example.demo.response;

import com.example.demo.entity.Course;

public class CourseResponse {
    private final Course course;

    public CourseResponse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }
}
