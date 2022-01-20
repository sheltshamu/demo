package com.example.demo.service;


import com.example.demo.request.AssignRequest;
import com.example.demo.response.CourseLecturerResponse;
@FunctionalInterface
public interface AssignCourseService {
    CourseLecturerResponse assign(AssignRequest assignRequest);
}
