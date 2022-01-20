package com.example.demo.response;

import com.example.demo.entity.Lecturer;

public class LecturerResponse {
    private final Lecturer lecturer;

    public LecturerResponse(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }
}
