/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exes.javapractise;

/**
 *
 * @author runal
 */
public class Multiplier {
    /*Create a Multiplier class.
Add three different version of  `multiply` method in it. First version should take 2 parameters, second version should take 3 parameter, the third version should take 4 parameter.
All the methods should return the multiplication of the parameters.
Create main class and add main method in it.
Demonstrate the use of method overloading in java.
    
*/
    public int multiply(int a, int b)
    {
        int multiplication = a * b;
        return multiplication;
    }
    public int multiply(int a, int b, int c)
    {
        int multiplication = a * b *c;
        return multiplication;
    }
    public int multiply(int a, int b, int c, int d)
    {
        int multiplication = a * b * c * d;
        return multiplication;
    }
}
