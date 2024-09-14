package org.example.homework.tasks.point;

public class Point implements Movable{
    private int x = 0;
    private int y = 0;

    @Override
    public void moveUp() {
        this.y = increaseValue(this.y);
    }

    @Override
    public void moveDown() {
        this.y = decreaseValue(this.y);
    }

    @Override
    public void moveLift() {
        this.x = decreaseValue(this.x);
    }

    @Override
    public void moveRight() {
        this.x = increaseValue(this.x);
    }

    private int increaseValue(int value) {
        return value + 1;
    }

    private int decreaseValue(int value) {
        return value - 1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
