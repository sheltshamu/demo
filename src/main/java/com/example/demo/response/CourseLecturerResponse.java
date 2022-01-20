package com.example.demo.response;

import com.example.demo.entity.CourseLecturer;

public class CourseLecturerResponse {
    private final CourseLecturer courseLecturer;

    public CourseLecturerResponse(CourseLecturer courseLecturer) {
        this.courseLecturer = courseLecturer;
    }

    public CourseLecturer getCourseLecturer() {
        return courseLecturer;
    }
}
