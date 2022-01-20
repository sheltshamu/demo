package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "lecturer")
public class Lecturer extends BaseEntity{

    @Column(name = "first_name",length = 50)
    private String firstName;

    @Column(name = "last_name",length = 50)
    private String lastName;

    @Column(name = "date_of_birth",nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "employee_number",unique = true,nullable = false)
    private String employeeNo;

    @Column(name = "identification_Number",unique = true,length = 35,nullable = false)
    private String identificationNo;

    @Column(length = 10)
    private String title;

    public Lecturer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", employeeNo='" + employeeNo + '\'' +
                ", identificationNo='" + identificationNo + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

