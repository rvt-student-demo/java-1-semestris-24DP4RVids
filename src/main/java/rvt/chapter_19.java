package rvt;

import java.util.Scanner;

public class chapter_19 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();

    
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start: ");
        int start = scanner.nextInt();

        System.out.print("Enter End: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
        
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter: N");
        int n = scanner.nextInt();

        int loopSum = 0;

        for(int i = 1; i <=n; i++) {
            loopSum += 1;


        int formulaSum = (n *(n + 1 )) / 2;
        
        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);
        }
    
    }
    
    public static void ex3() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N");;
        int n = scanner.nextInt();

        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i * i;
        }

        int formulaSum = n * (n + 1) * (2 * n + 1) / 6;

        long sumCubes = (long)Math.pow((n * (n + 1)) / 2, 2);
            
        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + loopSum);
        System.out.println("Loop Sum = " + loopSum);
    
    }

    public static void ex4() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter low: ");
        int low = input.nextInt();

        System.out.print("Enter high: ");
        int high = input.nextInt();

        // formula: sum(1..n) = n(n+1)/2
        int sumHigh = high * (high + 1) / 2;
        int sumLowMinus1 = (low - 1) * low / 2;

        int total = sumHigh - sumLowMinus1;

        System.out.println("Sum = " + total);

    }

    public static void ex5() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String inputString = input.nextLine();

        int times = inputString.length();

        System.out.println();
        for (int i = 0; i < times; i++) {
            System.out.println(inputString);
        }
    }

    public static void ex6() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String first = input.nextLine();

        System.out.print("Enter second word: ");
        String second = input.nextLine();

        int totalLength = 30;

        int dots = totalLength - (first.length() + second.length());

        System.out.print(first);

        for (int i = 0; i < dots; i++) {
            System.out.print(".");
        }

        System.out.println(second);
    }

    public static void ex7() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        input.close();
    }
}

