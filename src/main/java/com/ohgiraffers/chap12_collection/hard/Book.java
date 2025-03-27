package com.ohgiraffers.chap12_collection.hard;

public class Book {

    private String title;
    private String author;
    private int isbn;
    private boolean isForeignBook;

    public Book() {
    }

    public Book(String title, String author, int isbn, boolean isForeignBook) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isForeignBook = isForeignBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getisbn() {
        return isbn;
    }

    public void setisbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isForeignBook() {
        return isForeignBook;
    }

    public void setForeignBook(boolean foreignBook) {
        isForeignBook = foreignBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", isForeignBook=" + isForeignBook +
                '}';
    }
}
