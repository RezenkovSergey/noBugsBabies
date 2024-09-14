package org.example;

import org.example.homework.tasks.book.Book;
import org.example.homework.tasks.clock.Clock;
import org.example.homework.tasks.point.Point;
import org.example.homework.tasks.student.Student;
import org.example.homework.tasks.car.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
         System.out.println(sum(1, 5));
         System.out.println(diff(5, 1));

        Book book = new Book();
        book.setAuthor("Author");
        book.setName("Book name");
        book.setYearOfPublication("1999");
        book.display();

        Student student = new Student();
        student.setName("Student name");
        student.setGradeBookNumber("1234567890");
        student.setAverageGradeScore(4.56F);
        student.print();

        Point point = new Point();
        point.setX(10);
        point.setY(10);
        point.moveDown();
        point.moveLift();
        point.moveUp();
        point.moveRight();
        System.out.println(point.getX());
        System.out.println(point.getY());

        Clock clock = new Clock();
        clock.setTime(10, 0, 0);
        clock.tick();
        clock.readTime();

        Car car = new Car();
        car.setBrand("Brand name");
        car.setModel("Model name");
        car.setYearOfRelease("2024");
        car.drive(10);
        car.start();
        car.drive(10);
        car.stop();
    }

    private static int sum(int firstSummand, int secondSummand) {
        return firstSummand + secondSummand;
    }

    private static int diff(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }
}