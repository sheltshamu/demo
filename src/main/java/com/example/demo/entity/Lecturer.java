package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lecturer")
public class Lecturer extends BaseEntity{
    @Column(name = "employee_number",unique = true)
    private String employeeNo;
    @Column(name = "identification_Number",unique = true,length = 35)
    private String identificationNo;
    @Column(length = 50)
    private String name;
    @Column(length = 10)
    private String title;

    public Lecturer() {
    }

    public Lecturer(String employeeNo, String identificationNo, String name, String title) {
        this.employeeNo = employeeNo;
        this.identificationNo = identificationNo;
        this.name = name;
        this.title = title;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getIdentificationNo() {
        return identificationNo;
    }

    public void setIdentificationNo(String identificationNo) {
        this.identificationNo = identificationNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "employeeNo='" + employeeNo + '\'' +
                ", identificationNo='" + identificationNo + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

