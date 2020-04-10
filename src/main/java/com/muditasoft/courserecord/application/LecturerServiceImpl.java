package com.muditasoft.courserecord.application;

import com.muditasoft.courserecord.model.Course;
import com.muditasoft.courserecord.model.Lecturer;
import com.muditasoft.courserecord.model.LecturerRepository;
import com.muditasoft.courserecord.model.Semester;

import java.util.Optional;

/**
 * @author mucahitkurt
 * @since 30.04.2018
 */
public class LecturerServiceImpl implements LecturerService {

    private final LecturerRepository lecturerRepository;

    public LecturerServiceImpl(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    @Override
    public Optional<Lecturer> findLecturer(Course course, Semester semester) {
        if (course == null || semester == null) {
            throw new IllegalArgumentException("Can't find lecturer without course and semester");
        }
        return lecturerRepository.findByCourseAndSemester(course, semester);
    }
}
