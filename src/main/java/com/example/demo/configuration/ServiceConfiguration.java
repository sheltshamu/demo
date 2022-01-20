package com.example.demo.configuration;

import com.example.demo.persistence.CourseLecturerRepository;
import com.example.demo.persistence.CourseRepository;
import com.example.demo.persistence.LecturerRepository;
import com.example.demo.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {
    @Bean
    public LecturerCreateService lecturerCreateService(LecturerRepository lecturerRepository){
        return new LecturerCreateServiceImpl(lecturerRepository);
    }
    @Bean
    public CourseCreateService courseCreateService(CourseRepository courseRepository){
        return new CourseCreateServiceImpl(courseRepository);
    }

    @Bean
    public FindCourseService findCourseService(CourseRepository courseRepository){
        return new FindCourseServiceImpl(courseRepository);
    }

    @Bean
    public AssignCourseService assignCourseService(CourseLecturerRepository courseLecturerRepository,
                                                   CourseRepository courseRepository,
                                                   LecturerRepository lecturerRepository){
        return new AssignCourseServiceImpl(courseLecturerRepository,courseRepository,lecturerRepository);
    }


}
