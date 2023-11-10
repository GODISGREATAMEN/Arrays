package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numToChoose;
        String[] goods = new String[]{"Iphone X", "Samsung Galaxy A90", "MacBook PRO M2", "Apple Watch 2", "AirPods 2",
                "Airpods Pro"};

        System.out.println("Catalog\n---------------------");
        for (int i = 0; i < goods.length; i++) {
            System.out.printf("%d) %s%n", i + 1, goods[i]);
        }
        System.out.println("---------------------");
        System.out.println("What do you want to order?\nPlease, choose the appropriate number:");
        while (true) {
            if (scan.hasNextInt()) {
                numToChoose = scan.nextInt();
                System.out.printf("You have ordered %s%nThank you for your order!%nPlease, wait for the further " +
                        "information!", goods[numToChoose - 1]);
                break;
            } else {
                System.out.println("You might have entered something wrong!!!\nTry to repeat please!");
                scan.next();

            }
        }
    }

}