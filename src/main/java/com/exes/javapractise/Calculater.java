/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exes.javapractise;

import java.util.Scanner;

/**
 *
 * @author runal
 */
public class Calculater {

    int a;
    int b;

    void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        this.a = scanner.nextInt();
        System.out.println("Enter 2nd value:");
        this.b = scanner.nextInt();
    }

    /*Problem 2
Create Calculator class. 
Add member methods like add, subtract, multiply in the Calculator class.
Note your method should take two argument and return the result. 
For e.g. int add(int a,int b){}
Create main class and add main method in it.
Using Scanner take two numbers from the users. 
Using Scanner also ask user which operation they want to perform.
Based on the user input, perform the calculation and print the output.    */
    public int add() {
//        int a= 5;
        int addition = a + b;
        return addition;
    }

    public int subtract() {
        int subtraction = a - b;
        return subtraction;
    }

    public int divide() {
        int division = a / b;
        return division;
    }

    public int multiply() {
        int multiplication = a * b;
        return multiplication;
    }
}
