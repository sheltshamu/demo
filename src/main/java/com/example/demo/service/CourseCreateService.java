package com.example.demo.service;

import com.example.demo.request.CourseCreateRequest;
import com.example.demo.response.CourseResponse;

@FunctionalInterface
public interface CourseCreateService {
    CourseResponse create(CourseCreateRequest courseCreateRequest);
}
