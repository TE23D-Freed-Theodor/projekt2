package com.example.libsys;

public class Magazine extends LibraryItem {
    private int issueNumber;
    private String category;
    private int publishedYear;

    public Magazine(String id, String title, int issueNumber, String category, int publishedYear, boolean isAvailable) {
        super(id, title, isAvailable);
        this.issueNumber = issueNumber;
        this.category = category;
        this.publishedYear = publishedYear;
    }

    public String getMagazineInformation() {
        return title + " nummer " + issueNumber + " skrevs " + publishedYear + " och är i kategorin " + category;
    }
}
