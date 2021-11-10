package com.company;

public class MPH {
    private String SpeedType = "MPH";
    private double speed;

    public double findOutTheSpeedInMPH(){
        return speed;
    }

    public MPH(double speed) {
        this.speed = speed;
    }

    public String getSpeedType() {
        return SpeedType;
    }
    public void setSpeedType(String speedType) {
        SpeedType = speedType;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
