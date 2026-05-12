package com.example.libsys;
import java.util.ArrayList;
import java.util.Scanner;

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

            }
            else if (val == 2) {

            }
            else if (val == 3) {
                for (Book b : books) {
                    System.out.println(b.getBookInformation());
                }
            }
            else if (val == 4) {

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
            }
            else if (val == 5) {

            }
            else if (val == 6) {
                break;
            }
        }

    }
}