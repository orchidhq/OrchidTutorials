package com.example;

public class MainJava {

    public static void main(String... args) {
        ExampleApplication app = new ExampleApplication();

        System.out.println("Running " + app.getName() + " version " + app.getVersion() + "...");
        app.start("3");
        System.out.println("Finished!");
    }
}
