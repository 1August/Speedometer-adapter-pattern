package com.company;

public class Main {

    public static void main(String[] args) {
        MPH MPH = new MPH(140);
	    ISpeedConverterAdapter iSpeedConverterAdapter = new KMPH(MPH);

        System.out.println(MPH.findOutTheSpeedInMPH() + " " + MPH.getSpeedType() + " is - " + iSpeedConverterAdapter.findOutTheSpeedInKMPH() + " KMPH");
    }
}
