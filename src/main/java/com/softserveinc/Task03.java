package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
       System.out.println("Write how many gr of coffee beans the coffee machine has:");
       int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee do you want:");
        int cups = scanner.nextInt();
//        int count = Math.min(water / 200, milk / 50);
//        count = Math.min(count, beans / 15);
        if (water >= 200 && milk >= 50 && beans >= 15) {
            System.out.println("Yes, I can make " + cups + " of coffee");
        } else {
            System.out.println("No, I can not make " + cups + " of coffee");
        }
    }
    }
