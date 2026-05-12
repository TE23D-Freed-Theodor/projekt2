package com.example.libsys;

import java.util.ArrayList;
import java.util.Scanner;

/*

    >>>>>>>>>>>>>>>>>>>>>  Theodor Freed - TE23D <<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    I detta program kan man lägga till och visa böcker och tidningar i en meny


*/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Magazine> magazines = new ArrayList<>();

        while (true) {
            System.out.println("Här är min vackra meny >:)");
            System.out.println("1. Hämta böcker");
            System.out.println("2. Hämta tidningar");
            System.out.println("3. Visa alla hämtade saker");
            System.out.println("4. Addera bok");
            System.out.println("5. Addera tidning");
            System.out.println("6. Stäng programmet");

            int val = scanner.nextInt();
            scanner.nextLine();

            if (val == 1) {

            } else if (val == 2) {
               
            } else if (val == 3) {
                for (Book b : books) {
                    System.out.println(b.getBookInformation());
                }
                for (Magazine m : magazines) {
                    System.out.println(m.getMagazineInformation());
                }
            } else if (val == 4) {

                System.out.print("Vad ska titeln vara: ");
                String title = scanner.nextLine();

                System.out.print("Vem ska författaren vara: ");
                String author = scanner.nextLine();

                System.out.print("Vad ska genren vara: ");
                String genre = scanner.nextLine();

                System.out.print("Hur många sidor: ");
                int sidor = scanner.nextInt();
                scanner.nextLine();

                Book book = new Book("id", title, author, genre, sidor, true);

                books.add(book);

                System.out.println("Nu har vi lagt till boken!");
            } else if (val == 5) {
                System.out.print("Vad är titeln: ");
                String title = scanner.nextLine();

                System.out.print("Vilken issue number ska den ha: ");
                int issueNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Vad för kategori: ");
                String category = scanner.nextLine();

                System.out.print("Årtal: ");
                int year = scanner.nextInt();
                scanner.nextLine();

                Magazine magazine = new Magazine("id", title, issueNumber, category, year, true);
                magazines.add(magazine);

                System.out.println("Tidning tillagd!");
            } else if (val == 6) {
                break;
            }
        }

    }
}