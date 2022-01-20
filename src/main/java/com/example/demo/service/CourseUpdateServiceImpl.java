package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lecturer;
import com.example.demo.persistence.CourseRepository;
import com.example.demo.persistence.LecturerRepository;
import com.example.demo.response.CourseResponse;

public class CourseUpdateServiceImpl implements CourseUpdateService{

    private final CourseRepository courseRepository;
    private final LecturerRepository lecturerRepository;

    public CourseUpdateServiceImpl(CourseRepository courseRepository, LecturerRepository lecturerRepository) {
        this.courseRepository = courseRepository;
        this.lecturerRepository = lecturerRepository;
    }

    @Override
    public CourseResponse assignLecturer(Long courseId, Long lecturerId) {
        final Course course = courseRepository.findById(courseId)
                .orElseThrow(()-> new RuntimeException("Course not found"));

        final Lecturer lecturer = lecturerRepository.findById(lecturerId)
                .orElseThrow(()-> new RuntimeException("Course not found"));

        course.setLecturer(lecturer);
        return new CourseResponse(course);
    }
}
