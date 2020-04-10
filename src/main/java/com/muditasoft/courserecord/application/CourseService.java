package com.muditasoft.courserecord.application;

import com.muditasoft.courserecord.model.Course;
import com.muditasoft.courserecord.model.Department;

import java.util.Optional;

public interface CourseService {

    Optional<Course> findCourse(Course course);

    Optional<Course> findCourse(Department department, String code, String name);
}
