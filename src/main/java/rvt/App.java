package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // type[] arrayname = new type[lenght];
        int lenght = 10; // input
        int[] skaitli = new int[lenght];
        // [3, 11, 7, 0, 0]
        skaitli[0] = 3;
        skaitli[1] = 11;
        skaitli[2] = 7;

        // String[] strArr = new String[4];
        System.out.println(skaitli[0] + skaitli[1] - skaitli[2]);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give speed: ");
    int speed = scanner.nextInt();
    if (speed >= 120){
        System.out.println("Speeding ticket");
    }
    }
}