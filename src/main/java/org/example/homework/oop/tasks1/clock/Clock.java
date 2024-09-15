package org.example.homework.oop.tasks1.clock;

public class Clock implements Readable{
    private int hour;
    private int minute;
    private int second;

    @Override
    public void readTime() {
        String currentTime = String.format("Current time: %d:%d:%d", this.hour, this.minute, this.second);
        System.out.println(currentTime);
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void tick(){
        int newSecondValue = this.second + 1;
        int newMinuteValue = this.minute + (newSecondValue / 60);
        int newHourValue = (this.hour + (newMinuteValue / 60)) % 24;
        this.second = newSecondValue % 60;
        this.minute = this.minute % 60;
        this.hour = newHourValue % 24;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 | 24 <= hour) {
           System.out.println("Hour value should be from 0 to 23");
           return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 | 60 <= minute) {
            System.out.println("Minute value should be from 0 to 59");
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 | 60 <= second) {
            System.out.println("Second value should be from 0 to 59");
            return;
        }
        this.second = second;
    }
}
