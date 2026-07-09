package com.automation.utils;

public final class Environment {

    private static final String DEFAULT_ENV = "qa";

    private Environment() {
    }

    public static String getEnvironment() {

        String env = System.getProperty("env");

        if (env == null || env.isBlank()) {
            return DEFAULT_ENV;
        }

        return env.toLowerCase();
    }
}