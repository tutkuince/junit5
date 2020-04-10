package com.muditasoft.courserecord.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    @DisplayName
            ("Test every student must have an id, name and surname")
    @Tag("createStudent")
    void shouldCreateStudentWithIdNameAndSurname() {

        /**
         * Assertions.*
         * assertEquals
         * assertEquals with message
         * assertNotEquals
         * assertTrue with lazily evaluated message
         * assertFalse with boolean supplier
         * assertNull
         * assertNotNull
         * assertArrayEquals
         * assertSame
         */

        Student mucahit = new Student("1", "Mucahit", "Kurt");

        assertEquals("Mucahit", mucahit.getName()); // "Mucahit".equals(mucahit.getName())
        assertEquals("Mucahit", mucahit.getName(), "Student's name");
        assertNotEquals("Mucahitt", mucahit.getName(), "Student's name");

        assertTrue(mucahit.getName().startsWith("M"));
        assertTrue(mucahit.getName().startsWith("M"), () -> "Student's name " + "starts with Mu");
        assertFalse(() -> {
            Student mehmet = new Student("id1", "Mehmet", "Can");
            return mehmet.getName().endsWith("M");
        }, () -> "Student's name " + "ends with M");

        final Student ahmet = new Student("2", "Ahmet", "Yilmaz");

        assertArrayEquals(new String[]{"Mucahit", "Ahmet"}, Stream.of(mucahit, ahmet).map(Student::getName).toArray());

        Student student = mucahit;

        assertSame(mucahit, student); // mucahit == student
        assertNotSame(ahmet, student);
    }


}