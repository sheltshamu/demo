package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course_lecturer")
public class CourseLecturer extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "courseId",referencedColumnName = "id")
    private Course course;

    @ManyToOne
    @JoinColumn(name="lecturerId",referencedColumnName = "id")
    private Lecturer lecturer;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }


}
