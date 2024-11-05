package com.delphi.school.system.service;

import com.delphi.school.system.model.Teacher;
import com.delphi.school.system.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherRepository TeacherRepository;

    @Override
    public Teacher saveTeacher(Teacher Teacher){
        return TeacherRepository.save(Teacher);
    }

    @Override
    public Teacher updateTeacher(Teacher Teacher){
        return TeacherRepository.save(Teacher);
    }

    @Override
    public List<Teacher> getTeachers() {
        return TeacherRepository.findAll();
    }

    @Override
    public Teacher getTeacherById(Integer id){
        return TeacherRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTeacher(Integer id){TeacherRepository.deleteById(id);}
}
