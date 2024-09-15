package org.example.homework.oop.tasks2.student;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StudentTests {

    @Test
    public void creationStudentTest() {
        String studentName = "Student name";
        long studentID = 1;

        Student student = new Student();
        student.setName(studentName);
        student.setId(studentID);

        Assertions.assertEquals(studentName, student.getName());
        Assertions.assertEquals(studentID, student.getId());
    }
}
