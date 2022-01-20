package com.example.demo.service;

import com.example.demo.entity.Lecturer;
import com.example.demo.persistence.LecturerRepository;
import com.example.demo.request.LecturerCreateRequest;
import com.example.demo.response.LecturerResponse;

import java.time.LocalDateTime;

public class LecturerCreateServiceImpl implements LecturerCreateService{
    private final LecturerRepository lecturerRepository;

    public LecturerCreateServiceImpl(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    @Override
    public LecturerResponse create(LecturerCreateRequest lecturerCreateRequest) {
        Lecturer lecturer = new Lecturer();
        lecturer.setFirstName(lecturerCreateRequest.getFirstname());
        lecturer.setLastName(lecturerCreateRequest.getLastname());
        lecturer.setEmployeeNo(lecturerCreateRequest.getEmployeeNo());
        lecturer.setIdentificationNo(lecturerCreateRequest.getIdentificationNo());
        lecturer.setDateOfBirth(lecturerCreateRequest.getDateOfBirth());
        lecturer.setTitle(lecturerCreateRequest.getTitle());
        lecturer.setDateCreated(LocalDateTime.now());
        lecturer.setDateModified(LocalDateTime.now());
        lecturerRepository.save(lecturer);
        return new LecturerResponse(lecturer);
    }


}
