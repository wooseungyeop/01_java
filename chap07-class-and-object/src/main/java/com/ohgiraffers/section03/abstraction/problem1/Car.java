package com.ohgiraffers.section03.abstraction.problem1;

public class Car {

    private boolean isOn;
    private int speed;

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

}
