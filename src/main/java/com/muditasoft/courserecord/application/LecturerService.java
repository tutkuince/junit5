package com.muditasoft.courserecord.application;

import com.muditasoft.courserecord.model.Course;
import com.muditasoft.courserecord.model.Lecturer;
import com.muditasoft.courserecord.model.Semester;

import java.util.Optional;

public interface LecturerService {

    Optional<Lecturer> findLecturer(Course course, Semester semester);
}
