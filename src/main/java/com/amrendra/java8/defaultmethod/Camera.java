package com.amrendra.java8.defaultmethod;

public interface Camera {
    default void start() {
        System.out.println("Start the camera");
    }
}
