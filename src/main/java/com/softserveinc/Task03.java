package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print(">>> ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print(">>> ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.print(">>> ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print(">>> ");
        int cups = scanner.nextInt();
        int count;
//        int count = Math.min(water / 200, milk / 50);
//        count = Math.min(count, beans / 15);
//        if (water >= 200 && milk >= 50 && beans >= 15) {
        if (water / 200 < milk / 50) {
            count = water / 200;
        } else {
            count = milk / 50;
        }
        if (count > beans / 15) {
            count = beans / 15;
        }
        if (cups == count) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (count > cups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (count -cups) + " more than that)");
        } else {
            System.out.println("No, I can make only " + count + " cup(s) of coffee");
        }
    }
}
