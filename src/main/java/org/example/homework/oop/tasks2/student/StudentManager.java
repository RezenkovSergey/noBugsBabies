package org.example.homework.oop.tasks2.student;

import java.util.ArrayList;

public class StudentManager {
    private final ArrayList<Student> students = new ArrayList<>();

    public void addNewStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void removeStudent(long id) {
        students.removeIf(student -> student.getId() == id);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
