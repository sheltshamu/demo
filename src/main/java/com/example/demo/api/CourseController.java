package com.example.demo.api;

import com.example.demo.dto.CourseDto;
import com.example.demo.request.CourseCreateRequest;
import com.example.demo.response.CourseResponse;
import com.example.demo.service.CourseCreateService;
import com.example.demo.service.FindCourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseCreateService courseCreateService;
    private final FindCourseService findCourseService;

    public CourseController(CourseCreateService courseCreateService, FindCourseService findCourseService) {
        this.courseCreateService = courseCreateService;
        this.findCourseService = findCourseService;
    }

    @PostMapping("/create")
    public ResponseEntity<CourseDto> create(@RequestBody CourseCreateRequest courseCreateRequest){
        CourseResponse courseResponse = courseCreateService.create(courseCreateRequest);
        CourseDto courseDto = CourseDto.of(courseResponse.getCourse());
        return ResponseEntity.ok(courseDto);
    }


    @GetMapping("/find-by-id/{id}")
    public ResponseEntity<CourseDto> findById(@PathVariable("id") Long id){
        CourseResponse courseResponse = findCourseService.findById(id);
        CourseDto courseDto = CourseDto.of(courseResponse.getCourse());
        return ResponseEntity.ok(courseDto);
    }
}
