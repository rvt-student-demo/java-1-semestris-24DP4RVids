package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String product = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double price = scanner.nextDouble();

        System.out.print("Ekspress piegāde (0==ne, 1==ja): ");
        int express = scanner.nextInt();

        double delivery;
        if (price < 10) {
            delivery = 2.00;
        } else {
            delivery = 0.00;
        }
        if (express == 1) {
            delivery += 3.00;
        }

        double total = price + delivery;

        System.out.println("\nRekins:");
        System.out.printf("\n%-12s %.2f%n", product, price);
        System.out.printf("\npiegade     %.2f%n", delivery);
        System.out.printf("\nkopā        %.2f%n", total);
    }
    
}