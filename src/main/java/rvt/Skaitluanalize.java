package rvt;

import java.util.Scanner;

public class Skaitluanalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Ievadi pozitīvu skaitli (0 vai negatīvs skaitlis pārtrauc ievadi): ");
            int number = scanner.nextInt();

            if (number <= 0) {
                break;
            }

            sum += number;
            count++;

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("\nIevadīto skaitļu skaits: " + count);
            System.out.println("Skaitļu summa: " + sum);
            System.out.printf("Vidējā vērtība: %.1f%n", average);
            System.out.println("Lielākais skaitlis: " + max);
            System.out.println("Mazākais skaitlis: " + min);
        } else {
            System.out.println("Netika ievadīts neviens pozitīvs skaitlis.");
        }
    }
    
}

