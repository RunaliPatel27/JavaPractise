/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exes.javapractise;

/**
 *
 * @author runal
 */
public class MainProblem1 {
     public static void main(String a[]) {
        //object 1
        Mobile MobileOne = new Mobile();
        //setting object 1 
        MobileOne.setMobile(16, 250, 20, "Android");
        //object 2
        Mobile MobileTwo = new Mobile();
//setting object 2 
        MobileTwo.setMobile(12, 60, 10, "iOS");

    }
}
class Mobile {
    //instance variables aka member fields

    public int ram;
    public int rom;
    public int camerapixel;
    public String os;

    //parametarised constructor
    public void setMobile(int ramset, int romset, int camerapixelset, String osset) {
        ram = ramset;
        rom = romset;
        camerapixel = camerapixelset;
        os = osset;

    }

}
