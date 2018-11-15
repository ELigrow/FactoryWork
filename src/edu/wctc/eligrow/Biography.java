package edu.wctc.eligrow;

public class Biography implements IBook {
    String author;
    int pages;

    public Biography() {
        author = "Elijah Ligrow";
        pages = 365;
    }

    @Override
    public void displayBook() {
        System.out.println(author + "'s biography is " + pages + " pages long.");
    }
}
