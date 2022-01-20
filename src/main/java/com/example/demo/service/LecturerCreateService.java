package com.example.demo.service;

import com.example.demo.request.LecturerCreateRequest;
import com.example.demo.response.LecturerResponse;

@FunctionalInterface
public interface LecturerCreateService {
    LecturerResponse create(LecturerCreateRequest lecturerCreateRequest);
}
