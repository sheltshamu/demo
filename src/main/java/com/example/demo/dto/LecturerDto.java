package com.example.demo.dto;

import com.example.demo.entity.Lecturer;

import java.time.LocalDate;

public class LecturerDto {
    private String employeeNo;
    private String identificationNo;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String title;

    public LecturerDto() {
    }

    public static LecturerDto of(Lecturer lecturer){
        LecturerDto lecturerDto = new LecturerDto();
        lecturerDto.employeeNo=lecturer.getEmployeeNo();
        lecturerDto.identificationNo=lecturer.getIdentificationNo();
        lecturerDto.title=lecturer.getTitle();
        lecturerDto.firstname= lecturer.getFirstName();
        lecturerDto.lastname=lecturer.getLastName();
        lecturerDto.dateOfBirth=lecturer.getDateOfBirth();
        return lecturerDto;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public String getIdentificationNo() {
        return identificationNo;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getTitle() {
        return title;
    }
}
