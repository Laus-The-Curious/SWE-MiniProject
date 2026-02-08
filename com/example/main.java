package com.example;
import java.util.logging.Logger;
class Main{
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Program started");
        int i = 10/1; // This will cause ArithmeticException
        LOGGER.info(String.valueOf(i));
    }
}