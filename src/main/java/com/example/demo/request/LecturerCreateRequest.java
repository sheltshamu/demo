package com.example.demo.request;

import java.time.LocalDate;

public class LecturerCreateRequest {
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String identificationNo;
    private String employeeNo;
    private String title;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getIdentificationNo() {
        return identificationNo;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public String getTitle() {
        return title;
    }
}
