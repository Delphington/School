package com.delphi.school.system.control;

import com.delphi.school.system.configs.ApiRoutes;
import com.delphi.school.system.model.Teacher;
import com.delphi.school.system.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TeacherControl {
    @Autowired
    TeacherService teacherService;

    @PostMapping()
    public Teacher addTeacher(@RequestBody Teacher Teacher){
        return teacherService.saveTeacher(Teacher);
    }

    @PutMapping()
    public Teacher saveTeacher(@RequestBody Teacher Teacher){
        return teacherService.saveTeacher(Teacher);
    }

    @GetMapping(ApiRoutes.ID)
    public Teacher getTeacher(@PathVariable Integer id){
        return teacherService.getTeacherById(id);
    }

    @GetMapping()
    public List<Teacher> getTeachers(){return teacherService.getTeachers();}

    @DeleteMapping(ApiRoutes.ID)
    public void deleteTeacher(@PathVariable Integer id){teacherService.deleteTeacher(id);}
}
