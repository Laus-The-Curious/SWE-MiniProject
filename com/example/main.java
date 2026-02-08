package com.example;
class Main{
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("Hello, World!");
        int i = 10/1; // This will cause ArithmeticException
        logger.log(i); 
    }
}