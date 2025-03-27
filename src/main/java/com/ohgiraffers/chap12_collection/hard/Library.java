package com.ohgiraffers.chap12_collection.hard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private static List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // 도서 추가
    public void addBook(Book book) {
        books.add(book);
    }

    // 도서 조회
    public Book getBook(int isbn) {
        for (Book book : books) {
            if (book.getisbn() == isbn) {
                return book;
            }
        }
        return null;
    }

    // 도서 수정
    public void updateBook(int isbn, String title, String author) {
        Book book = getBook(isbn);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
        }
    }

    // 도서 삭제
    public void deleteBook(int isbn) {
//        books.removeIf(book -> book.getisbn() == isbn);

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getisbn() == isbn) {
                books.remove(i);
                break;
                // 삭제가 완료되었으면 더 이상 반복할 필요가 없으므로 삭제 작업 종료
            }
        }
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
