package com.example.demo.configuration;

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
    public CourseCreateService courseCreateService(CourseRepository courseRepository,LecturerRepository lecturerRepository){
        return new CourseCreateServiceImpl(courseRepository,lecturerRepository);
    }

    @Bean
    public CourseUpdateService courseUpdateService(CourseRepository courseRepository,LecturerRepository lecturerRepository){
        return new CourseUpdateServiceImpl(courseRepository,lecturerRepository);
    }

    @Bean
    public FindCourseService findCourseService(CourseRepository courseRepository){
        return new FindCourseServiceImpl(courseRepository);
    }
}
