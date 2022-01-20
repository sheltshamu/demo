package com.example.demo.api;

import com.example.demo.dto.CourseLecturerDto;
import com.example.demo.dto.LecturerDto;
import com.example.demo.request.AssignRequest;
import com.example.demo.response.CourseLecturerResponse;
import com.example.demo.response.LecturerResponse;
import com.example.demo.request.LecturerCreateRequest;
import com.example.demo.service.AssignCourseService;
import com.example.demo.service.LecturerCreateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lecturer")
public class LecturerController {

    private final LecturerCreateService lecturerCreateService;
    private final AssignCourseService assignCourseService;

    public LecturerController(LecturerCreateService lecturerCreateService, AssignCourseService assignCourseService) {
        this.lecturerCreateService = lecturerCreateService;
        this.assignCourseService = assignCourseService;
    }

    @PostMapping("/create")
    public ResponseEntity<LecturerDto> create(@RequestBody LecturerCreateRequest lecturerCreateRequest){
        LecturerResponse lecturerResponse = lecturerCreateService.create(lecturerCreateRequest);
        LecturerDto lecturerDto = LecturerDto.of(lecturerResponse.getLecturer());
        return ResponseEntity.ok(lecturerDto);
    }

    @PostMapping("/assign")
    public ResponseEntity<CourseLecturerDto> assignCourse(@RequestBody AssignRequest assignRequest){
        CourseLecturerResponse courseLecturerResponse = assignCourseService.assign(assignRequest);
        CourseLecturerDto courseLecturerDto = new CourseLecturerDto(courseLecturerResponse.getCourseLecturer());
        return ResponseEntity.ok(courseLecturerDto);
    }

}
