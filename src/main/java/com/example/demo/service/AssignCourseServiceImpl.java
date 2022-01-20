package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseLecturer;
import com.example.demo.entity.Lecturer;
import com.example.demo.persistence.CourseLecturerRepository;
import com.example.demo.persistence.CourseRepository;
import com.example.demo.persistence.LecturerRepository;
import com.example.demo.request.AssignRequest;
import com.example.demo.response.CourseLecturerResponse;

import java.time.LocalDateTime;

public class AssignCourseServiceImpl implements AssignCourseService{
    private final CourseLecturerRepository courseLecturerRepository;
    private final CourseRepository courseRepository;
    private final LecturerRepository lecturerRepository;

    public AssignCourseServiceImpl(CourseLecturerRepository courseLecturerRepository, CourseRepository courseRepository, LecturerRepository lecturerRepository) {
        this.courseLecturerRepository = courseLecturerRepository;
        this.courseRepository = courseRepository;
        this.lecturerRepository = lecturerRepository;
    }

    @Override
    public CourseLecturerResponse assign(AssignRequest assignRequest) {
        Lecturer lecturer = lecturerRepository.findById(assignRequest.getLecturerId())
                .orElseThrow(()-> new RuntimeException("lecturer not found"));

        Course course = courseRepository.findById(assignRequest.getCourseId())
                .orElseThrow(()-> new RuntimeException("course not found"));

        CourseLecturer courseLecturer = new CourseLecturer();
        courseLecturer.setLecturer(lecturer);
        courseLecturer.setCourse(course);
        courseLecturer.setDateCreated(LocalDateTime.now());
        courseLecturer.setDateModified(LocalDateTime.now());
        courseLecturerRepository.save(courseLecturer);
        return new CourseLecturerResponse(courseLecturer);
    }
}
