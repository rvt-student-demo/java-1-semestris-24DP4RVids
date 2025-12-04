package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {

    public static class Book {
        private String title;
        private int pages;
        private int year;

        public Book(String title, int pages, int year) {
            this.title = title;
            this.pages = pages;
            this.year = year;
        }

        public String getTitle() {
            return this.title;
        }

        public String toString() {
            return this.title + ", " + this.pages + " pages, " + this.year;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.print("\nWhat information will be printed? ");
        String choice = scanner.nextLine();

        for (Book book : books) {
            if (choice.equals("everything")) {
                System.out.println(book);
            } else if (choice.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}