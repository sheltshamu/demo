package com.example.demo.entity;


import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course extends BaseEntity{
    @Column(unique = true,length = 10)
    private String code;

    @Column(unique = true,length = 30)
    private String name;

    public Course() {
    }

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
