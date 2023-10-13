package org.example;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("введіть число хвилин:");

                long minutes = scanner.nextLong();

                scanner.close();


                long years = minutes / (60 * 24 * 365);
                long days = (minutes %(60 * 24 * 365)) / (60 * 24);

                System.out.println("minutes + хвилини приблизно = " + years + "рокам," + days + "дням");
            }

        }