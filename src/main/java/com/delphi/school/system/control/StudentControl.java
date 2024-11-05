package com.delphi.school.system.control;

import com.delphi.school.system.configs.ApiRoutes;
import com.delphi.school.system.model.Student;
import com.delphi.school.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiRoutes.STUDENT)
public class StudentControl {

    @Autowired
    StudentService studentService;

    @PostMapping()
    public Student addStudent(@RequestBody Student Student){
        return studentService.saveStudent(Student);
    }

    @PutMapping()
    public Student saveStudent(@RequestBody Student Student){
        return studentService.saveStudent(Student);
    }

    @GetMapping(ApiRoutes.ID)
    public Student getStudent(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    @GetMapping()
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @DeleteMapping(ApiRoutes.ID)
    public void deleteStudent(@PathVariable Integer id){studentService.deleteStudent(id);}
}
