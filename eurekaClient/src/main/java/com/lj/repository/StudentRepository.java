package com.lj.repository;

import com.lj.Student;

import java.util.Collection;

public interface StudentRepository {

    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUPdate(Student student);
    public void deleteById(long id);
}
