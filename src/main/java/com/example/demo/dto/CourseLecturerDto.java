package com.example.demo.dto;

import com.example.demo.entity.CourseLecturer;

public class CourseLecturerDto {
    private Long courseId;
    private Long lecturerId;

    public CourseLecturerDto(CourseLecturer courseLecturer) {
        this.courseId=courseLecturer.getCourse().getId();
        this.lecturerId=courseLecturer.getLecturer().getId();
    }
}
