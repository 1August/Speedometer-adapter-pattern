package com.company;

public class KMPH implements ISpeedConverterAdapter {
    private String SpeedType = "KMPH";
    private MPH MPH;

    @Override
    public double findOutTheSpeedInKMPH() {
        return MPH.findOutTheSpeedInMPH() / 1.61;
    }

    public KMPH(MPH MPH) {
        this.MPH = MPH;
    }

    public String getSpeedType() {
        return SpeedType;
    }
    public void setSpeedType(String speedType) {
        SpeedType = speedType;
    }
    public com.company.MPH getMPH() {
        return MPH;
    }
    public void setMPH(com.company.MPH MPH) {
        this.MPH = MPH;
    }
}
