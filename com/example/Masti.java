package com.example;

class Masti{
    public static void main(String[] args) {
        int j = 10/0; // This will cause ArithmeticException
        Logger logger = Logger.getLogger(Masti.class.getName());
        logger.info("This is an info message" + j);
    }
}