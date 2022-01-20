package com.example.demo.persistence;

import com.example.demo.entity.Lecturer;

import java.util.List;

public interface LecturerRepository extends BaseRepository<Lecturer>{
    List<Lecturer> findLecturerByName(String name);
}
