package edu.wctc.eligrow;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    BookFactory bookFactory = new BookFactory();
        ArrayList<IBook> books = new ArrayList<>();

        books.add(bookFactory.getBook(BookType.BIOGRAPHY));
        books.add(bookFactory.getBook(BookType.FICTION));
        books.add(bookFactory.getBook(BookType.GRAPHICNOVEL));

        for (IBook b:books){
            b.displayBook();
        }
    }
}
