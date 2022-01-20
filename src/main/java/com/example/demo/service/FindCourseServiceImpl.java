package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.persistence.CourseRepository;
import com.example.demo.response.CourseResponse;

public class FindCourseServiceImpl implements FindCourseService{

    private final CourseRepository courseRepository;

    public FindCourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseResponse findById(Long id) {
        Course course = courseRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Course not found"));
        return new CourseResponse(course);
    }
}
