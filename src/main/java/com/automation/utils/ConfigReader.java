package com.automation.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ConfigReader {

    private static final Properties PROPERTIES = new Properties();

    static {

        String environment = Environment.getEnvironment();
        String fileName = environment + ".properties";

        try (InputStream input = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream(fileName)) {
            if (input == null) {
                throw new RuntimeException(
                        "No se encontró el archivo: " + fileName);
            }
            PROPERTIES.load(input);
        } catch (IOException e) {
            throw new RuntimeException(
                    "Error leyendo " + fileName, e);
        }
    }

    private ConfigReader() {
    }

    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }

    public static int getInt(String key) {
        return Integer.parseInt(PROPERTIES.getProperty(key));
    }

    public static boolean getBoolean(String key) {
        return Boolean.parseBoolean(PROPERTIES.getProperty(key));
    }

}