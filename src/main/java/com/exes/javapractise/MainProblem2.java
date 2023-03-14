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
public class MainProblem2 {
//
//    static int value1;
//    //System.out.println(value1);
//    static int value2;
//
//    void question1() {
//
//    }
//
//    static void question(Scanner option) {
//        System.out.println("Enter your first value: ");
//        value1 = option.nextInt();
//        System.out.println("Enter your second value: ");
//        value2 = option.nextInt();
//    }

    public static void main(String argument[]) {
        System.out.println("Choose your number ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        Scanner option = new Scanner(System.in);

        //create scanner object
        int selection = option.nextInt();
        Calculater objcalc = new Calculater();

        if (selection == 1) {
            objcalc.takeInput();
            int result = objcalc.add();
            System.out.println("Your answer is: " + result);
        } else if (selection == 2) {
            objcalc.takeInput();
            int result = objcalc.subtract();
            System.out.println("Your answer is: " + result);

        } else if (selection == 3) {
            objcalc.takeInput();
            int result = objcalc.divide();
            System.out.println("Your answer is: " + result);
        } else if (selection == 4) {
            objcalc.takeInput();
            int result = objcalc.multiply();
            System.out.println("Your answer is: " + result);
        } else {
            System.out.println("Invalid Number");
        }

    }

}
