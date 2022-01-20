package com.example.demo.dto;

import com.example.demo.entity.Lecturer;

public class LecturerDto {
    private String employeeNo;
    private String identificationNo;
    private String name;
    private String title;

    public LecturerDto() {
    }

    public static LecturerDto of(Lecturer lecturer){
        LecturerDto lecturerDto = new LecturerDto();
        lecturerDto.employeeNo=lecturer.getEmployeeNo();
        lecturerDto.identificationNo=lecturer.getIdentificationNo();
        lecturerDto.name=lecturer.getName();
        lecturerDto.title=lecturer.getTitle();
        return lecturerDto;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public String getIdentificationNo() {
        return identificationNo;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
