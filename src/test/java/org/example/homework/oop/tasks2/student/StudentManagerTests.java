package org.example.homework.oop.tasks2.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudentManagerTests {

    @Test
    public void additionNewStudentTest() {
        String studentName = "Student name";
        long studentId = 1;

        Student student = new Student();
        student.setName(studentName);
        student.setId(studentId);

        StudentManager manager = new StudentManager();
        manager.addNewStudent(student);

        Assertions.assertEquals(1, manager.getStudents().size());
        Assertions.assertEquals(studentName, manager.getStudents().get(0).getName());

    }

    @Test
    public void gettingListStudentsTest() {
        String firstStudentName = "First student name";
        long firstStudentId = 1;
        String secondStudentName = "Second student name";
        long secondStudentId = 2;

        Student firstStudent = new Student();
        firstStudent.setName(firstStudentName);
        firstStudent.setId(firstStudentId);
        Student secondStudent = new Student();
        secondStudent.setName(secondStudentName);
        secondStudent.setId(secondStudentId);

        StudentManager manager = new StudentManager();
        manager.addNewStudent(firstStudent);
        manager.addNewStudent(secondStudent);

        ArrayList<Student> students = manager.getStudents();

        Assertions.assertEquals(2, students.size());
        Assertions.assertTrue(students.contains(firstStudent));
        Assertions.assertTrue(students.contains(secondStudent));
    }

    @Test
    public void removingStudentTest() {
        String firstStudentName = "First student name";
        long firstStudentId = 1;
        String secondStudentName = "Second student name";
        long secondStudentId = 2;

        Student firstStudent = new Student();
        firstStudent.setName(firstStudentName);
        firstStudent.setId(firstStudentId);

        Student secondStudent = new Student();
        secondStudent.setName(secondStudentName);
        secondStudent.setId(secondStudentId);

        StudentManager manager = new StudentManager();
        manager.addNewStudent(firstStudent);
        manager.addNewStudent(secondStudent);
        manager.removeStudent(firstStudentId);
        ArrayList<Student> students = manager.getStudents();

        Assertions.assertEquals(1, students.size());
        Assertions.assertTrue(students.contains(secondStudent));

    }
}
