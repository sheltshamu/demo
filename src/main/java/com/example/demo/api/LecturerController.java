package com.example.demo.api;

import com.example.demo.dto.LecturerDto;
import com.example.demo.request.LecturerCreateRequest;
import com.example.demo.response.LecturerResponse;
import com.example.demo.service.LecturerCreateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lecturer")
public class LecturerController {

    private final LecturerCreateService lecturerCreateService;

    public LecturerController(LecturerCreateService lecturerCreateService) {
        this.lecturerCreateService = lecturerCreateService;
    }

    @PostMapping("/create")
    public ResponseEntity<LecturerDto> create(@RequestBody LecturerCreateRequest lecturerCreateRequest){
        LecturerResponse lecturerResponse = lecturerCreateService.create(lecturerCreateRequest);
        LecturerDto lecturerDto = LecturerDto.of(lecturerResponse.getLecturer());
        return ResponseEntity.ok(lecturerDto);
    }


}
