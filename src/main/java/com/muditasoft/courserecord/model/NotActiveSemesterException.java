package com.muditasoft.courserecord.model;

/**
 * @author mucahitkurt
 * @since 19.04.2018
 */
public class NotActiveSemesterException extends RuntimeException {

    public NotActiveSemesterException(String message) {
        super(message);
    }
}
