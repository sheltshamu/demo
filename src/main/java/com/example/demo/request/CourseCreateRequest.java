package com.example.demo.request;

import com.example.demo.entity.Lecturer;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CourseCreateRequest {
    private String name;

    public CourseCreateRequest() {
    }

    public String getName() {
        return name;
    }

}
