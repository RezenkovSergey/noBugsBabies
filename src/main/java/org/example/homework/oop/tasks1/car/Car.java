package org.example.homework.oop.tasks1.car;

public class Car implements Drivable{
    private String brand;
    private String model;
    private String yearOfRelease;
    private boolean isStarted = false;

    @Override
    public void start() {
        isStarted = true;
        System.out.println("The Car is started");
    }

    @Override
    public void stop() {
        isStarted = false;
        System.out.println("The car is stopped");
    }

    @Override
    public void drive(int distance) {
        if (isStarted) {
            String traveledDistance = String.format("The car traveled a distance of %d ", distance);
            System.out.println(traveledDistance);
        } else {
            System.out.println("The car isn't started");
        }
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
