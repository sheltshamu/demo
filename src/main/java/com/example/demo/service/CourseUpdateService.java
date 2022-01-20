package com.example.demo.service;

import com.example.demo.response.CourseResponse;
@FunctionalInterface
public interface CourseUpdateService {
    CourseResponse assignLecturer(Long courseId, Long lecturerId);
}
