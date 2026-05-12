package com.example.libsys;

public class Book extends LibraryItem {
    private String author;
    private String genre;
    private int pages;

    public Book(String id, String title, String author, String genre, int pages, boolean isAvailable) {
        super(id, title, isAvailable);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    public String getBookInformation() {
        return title + " är skriven av " + author + " och har " + pages + " sidor.";
    }
}
