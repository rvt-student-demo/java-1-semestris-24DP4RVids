package rvt;

import java.util.Scanner;

public class cikls {
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int numbersRead = 0;
        int sum = 0;

        while (true) {
            if (numbersRead == 5) {
                break;
            }

            System.out.println("Imput number");
            sum = sum + Integer.valueOf(scanner.nextLine());
            numbersRead = numbersRead + 1;
        }

        System.out.println("The sum of the numbers is" + sum);
    }
}
