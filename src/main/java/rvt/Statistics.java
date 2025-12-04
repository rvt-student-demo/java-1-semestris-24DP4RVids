package rvt;

import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return (double) this.sum / this.count;
    }

    public static void main(String[] args) {

        // PART 2
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());

        // PART 3
        Scanner scanner = new Scanner(System.in);
        Statistics userStats = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            userStats.addNumber(input);
        }
        System.out.println("Sum: " + userStats.sum());
// PART 4
        Scanner scanner2 = new Scanner(System.in);
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int num = Integer.parseInt(scanner2.nextLine());
            if (num == -1) {
                break;
            }
            allNumbers.addNumber(num);
            if (num % 2 == 0) {
                evenNumbers.addNumber(num);
            } else {
                oddNumbers.addNumber(num);
            }
        }
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}