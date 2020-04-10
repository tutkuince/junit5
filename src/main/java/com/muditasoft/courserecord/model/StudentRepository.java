package com.muditasoft.courserecord.model;

import java.util.Optional;

/**
 * @author mucahitkurt
 * @since 30.04.2018
 */
public interface StudentRepository {

    Optional<Student> findById(String id);

    Student save(Student student);

    void delete(Student student);
}
