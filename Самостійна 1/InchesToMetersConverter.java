package org.example;

import java.util.Scanner;

public class InchesToMetersConverter {
    public static void main(String[]args){

        Scanner scanner = new Scanner (System.in);

        System.out.print("введіть число в дюймах");
        double inches = scanner.nextByte();
        scanner.close();
double meters = inches * 0.0254;

System.out.println(inches + "дюймів = " + meters + "метрів");

    }
}