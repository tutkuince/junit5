package com.muditasoft.courserecord.model;

/**
 * @author mucahitkurt
 * @since 29.04.2018
 */
public class NoCourseFoundForStudentException extends RuntimeException {

    public NoCourseFoundForStudentException(String message) {
        super(message);
    }
}
