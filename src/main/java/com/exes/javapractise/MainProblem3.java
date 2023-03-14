/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exes.javapractise;

/**
 *
 * @author runal
 */
public class MainProblem3 {
    public static void main (String a[]){
    Multiplier multiplyobj = new Multiplier();
    
    int firstmethod = multiplyobj.multiply(3, 3);
    int secondmethod = multiplyobj.multiply(3,3,3);
    int thirdmethod = multiplyobj.multiply(3, 3, 3, 3);
    
    System.out.println("The result of first version with two parameters: " + firstmethod);
    System.out.println("The result of second version with three parameters: " + secondmethod);
    System.out.println("The result of third version with four parameters: " + thirdmethod);
}
}
