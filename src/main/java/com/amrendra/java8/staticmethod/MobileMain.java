package com.amrendra.java8.staticmethod;

public class MobileMain {
    public static void main(String[] args) {
         SmartMobile mobile = new SmartMobile();
         mobile.powerOn();
         Camera.start();
         MusicPlayer.start();

    }
}
