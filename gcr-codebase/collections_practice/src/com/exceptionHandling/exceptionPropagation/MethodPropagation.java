package com.exceptionHandling.exceptionPropagation;

public class MethodPropagation {

    // Exception occurs here
    public static void method1() {
        System.out.println("Entering method1...");
        int result = 10 / 0; // Triggers ArithmeticException
        System.out.println("This line will never be printed.");
    }

    //  Exception propagates to this method
    public static void method2() {
        System.out.println("Entering method2... calling method1");
        method1();
        System.out.println("Returning to method2...");
    }

    public static void main(String[] args) {
        try {
            System.out.println("In main: calling method2");
            method2();
        } catch (ArithmeticException e) {
            // Exception finally handled here
            System.out.println(" Handled exception in main: " + e.getMessage());
        }
        
        System.out.println("Main continues execution...");
    }
}