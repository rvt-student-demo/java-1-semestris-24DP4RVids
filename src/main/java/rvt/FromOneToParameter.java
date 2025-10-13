package rvt;

import java.util.Scanner;

public class FromOneToParameter {
    public static void printUntilNumber(int number) {
        Scanner scanner = new Scanner(System.in);
            for( int i = 1; 1 <= number; i++) {
                System.out.println(i);

            }
    }
    public static void main(String[] args) {
        printUntilNumber(5);
        System.out.println("_____");
        printUntilNumber(3);
        
    }
}