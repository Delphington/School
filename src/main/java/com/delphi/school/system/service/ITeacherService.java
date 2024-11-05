package com.delphi.school.system.service;

import com.delphi.school.system.model.Teacher;

import java.util.List;

public interface ITeacherService {
    Teacher saveTeacher(Teacher Teacher);

    Teacher updateTeacher(Teacher Teacher);

    List<Teacher> getTeachers();

    Teacher getTeacherById(Integer id);

    void deleteTeacher(Integer id);
}
