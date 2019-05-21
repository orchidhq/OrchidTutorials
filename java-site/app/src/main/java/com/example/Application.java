package com.example;

/**
 * An Application that can be run with arbitrary arguments.
 */
public interface Application {

    /**
     * The name of the application
     */
    String getName();

    /**
     * The current application version
     */
    String getVersion();

    /**
     * Run this application with the arguments provided
     *
     * @param args the args to configure the application
     */
    void start(String... args);
}