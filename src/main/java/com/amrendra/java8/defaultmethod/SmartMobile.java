package com.amrendra.java8.defaultmethod;

public class SmartMobile extends Mobile implements MusicPlayer, Camera {

    public SmartMobile() {
        System.out.println("Modern Mobile Phone is Created");
    }

    /*
    @Override
    public void start() {
        System.out.println("Started Camera and Music Player");
    }
 */

    @Override
    public void start() {
        MusicPlayer.super.start();
        Camera.super.start();
    }
}
