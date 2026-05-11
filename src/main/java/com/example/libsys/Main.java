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

            System.out.println(val);
        }

    }
}