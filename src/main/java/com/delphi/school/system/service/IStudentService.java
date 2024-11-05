package com.delphi.school.system.service;

import com.delphi.school.system.model.Student;

import java.util.List;

public interface IStudentService {
    Student saveStudent(Student Student);

    List<Student> getStudents();

    Student getStudentById(Integer id);

    void deleteStudent(Integer id);
}
