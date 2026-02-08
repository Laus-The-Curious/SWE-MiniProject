package com.example;
class Main{
    public static void main(String[] args) {
        Logger.log("Hello, World!");
        int i = 10/1; // This will cause ArithmeticException
        Logger.log(i); 
    }
}