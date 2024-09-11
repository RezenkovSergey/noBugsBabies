package org.example.homework.tasks.student;

public class Student implements Printable{
    private String name;
    private String gradeBookNumber;
    private float averageGradeScore;

    @Override
    public void print() {
        String studentInfo = String.format("Student %s with grade book number %s has average grade score %f",
                name, gradeBookNumber, averageGradeScore);
        System.out.println(studentInfo);
    }

    public String getName() {
        return name;
    }

    public String getGradeBookNumber() {
        return gradeBookNumber;
    }

    public float getAverageGradeScore() {
        return averageGradeScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeBookNumber(String gradeBookNumber) {
        this.gradeBookNumber = gradeBookNumber;
    }

    public void setAverageGradeScore(float averageGradeScore) {
        this.averageGradeScore = averageGradeScore;
    }
}
