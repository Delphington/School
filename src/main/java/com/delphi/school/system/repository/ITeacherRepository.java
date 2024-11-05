package com.delphi.school.system.repository;

import com.delphi.school.system.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeacherRepository extends JpaRepository<Teacher,Integer> {
}
