package com.amrendra.java8.defaultmethod;

public interface MusicPlayer {
    default void start() {
        System.out.println("Start the Music Player");
    }
}
