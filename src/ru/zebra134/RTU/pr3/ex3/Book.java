package ru.zebra134.RTU.pr3.ex3;

public class Book {
    private String author;
    private String name;
    private int dateOfWriting;
    private int pages;

    public Book(String author, String name, int dateOfWriting, int pages) {
        this.author = author;
        this.name = name;
        this.dateOfWriting = dateOfWriting;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfWriting() {
        return dateOfWriting;
    }

    public void setDateOfWriting(int dateOfWriting) {
        this.dateOfWriting = dateOfWriting;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", dateOfWriting=" + dateOfWriting +
                ", pages=" + pages +
                '}';
    }
}
