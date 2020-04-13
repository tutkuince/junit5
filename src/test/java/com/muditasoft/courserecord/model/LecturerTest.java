package com.muditasoft.courserecord.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    /**
     * When a lecturer course record is added to lecturer then lecturer course record size increase
     * Lecturer course record has lecturer when added to lecturer
     * Throws illegal argument exception when a null course is added to lecturer
     * Throws not active semester exception when a course is added for not active semester.
     *
     * */

    @Test
    @DisplayName("When a lecturer course record is added to lecturer then lecturer course record size increase")
    void whenACourseIsAddedToLecturerThenLecturerCourseSizeIncrease() {
        Lecturer lecturer = new Lecturer();
        LecturerCourseRecord lecturerCourseRecord = new LecturerCourseRecord(new Course(), new Semester());

        assertEquals(0, lecturer.getLecturerCourseRecords().size());
        lecturer.addLecturerCourseRecord(lecturerCourseRecord);

        assertEquals(1, lecturer.getLecturerCourseRecords().size());

    }
}