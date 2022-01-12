package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        System.out.println("How much water do you need?");
        int number= Integer.parseInt(scanner.nextLine());
        if (number > 300) {
        System.out.println("How much milk do you need?");
            } else {
            System.out.println("No coffee for today" );
        }

    }
}
