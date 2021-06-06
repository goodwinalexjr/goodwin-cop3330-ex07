/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int a = numbers.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int b = numbers.nextInt();
        System.out.println("You entered diensions of " + a + " feet by " + b + " feet.");
        System.out.println("The area is");
        int c  = a * b;
        System.out.println(c + " square feet");
        double d = c * 0.09290304;
        DecimalFormat mform = new DecimalFormat("#.000");
        System.out.println(mform.format(d) + " square meters");
    }
}
