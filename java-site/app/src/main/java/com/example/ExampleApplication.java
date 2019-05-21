package com.example;

public class ExampleApplication implements Application {
    @Override
    public String getName() {
        return "Example Java Application";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public void start(String... args) {
        int iterations = Integer.parseInt(args[0]);

        for (int i = 1; i <= iterations; i++) {
            System.out.println(i + "...");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
