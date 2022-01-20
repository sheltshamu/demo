package com.example.demo.service;

import com.example.demo.response.CourseResponse;

public interface FindCourseService {
    CourseResponse findById(Long id);
}
