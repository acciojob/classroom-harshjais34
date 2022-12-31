package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudentFromRepo(Student s)
    {
        studentRepository.saveStudent(s);
    }

    public Student getStudentByNameFromService(String x)
    {
        return studentRepository.findStudent(x);
    }
    public void addTeacherToDB(Teacher t)
    {
        studentRepository.saveTeacher(t);
    }

    public Teacher getTeacherByNameFromService(String x)
    {
        return studentRepository.findTeacher(x);
    }

    public List<String> getAllStudentsFromRepo()
    {
        return studentRepository.findAllStudents();
    }

    public void pairToRepo(String t , String student)
    {
        studentRepository.saveStudentTeacherPair(t , student);
    }

    public List<String> getStudentsByTeacherNameFromRepo(String t)
    {
        return studentRepository.findStudentsFromTeacher(t);
    }

    public void  deleteTeacherByNameFromRepo(String t)
    {
        studentRepository.deleteTeacher(t);
    }

    public void deleteAllTeachersFromRepo()
    {
        studentRepository.deleteAllTeacher();
    }
}