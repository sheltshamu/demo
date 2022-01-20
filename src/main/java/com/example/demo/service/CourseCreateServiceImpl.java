package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lecturer;
import com.example.demo.persistence.CourseRepository;
import com.example.demo.persistence.LecturerRepository;
import com.example.demo.request.CourseCreateRequest;
import com.example.demo.response.CourseResponse;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class CourseCreateServiceImpl implements CourseCreateService{
    private final CourseRepository courseRepository;
    private final LecturerRepository lecturerRepository;

    public CourseCreateServiceImpl(CourseRepository courseRepository, LecturerRepository lecturerRepository) {
        this.courseRepository = courseRepository;
        this.lecturerRepository = lecturerRepository;
    }

    @Override
    public CourseResponse create(CourseCreateRequest courseCreateRequest) {
        Course course = new Course();
        course.setCode(generateCode(courseCreateRequest.getName()));
        course.setName(courseCreateRequest.getName());
        course.setDateCreated(LocalDateTime.now());
        course.setDateModified(LocalDateTime.now());
        courseRepository.save(course);
        return new CourseResponse(course);
    }

    public String generateCode(String courseName){
        Random random = new Random();
        String letters = courseName.substring(0,2).toUpperCase();
        String finalCode = letters+"00"+random.nextInt(15);
        return finalCode;
    }
}
