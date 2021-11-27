package com.gdut.software.mapper;

import com.gdut.software.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    public Student selectStudentById(int id);

    public int addStudent(Student student);

}
