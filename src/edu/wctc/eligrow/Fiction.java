package edu.wctc.eligrow;

public class Fiction implements IBook {
    String genre;

    public Fiction() {
        genre = "Sci-fi";
    }

    @Override
    public void displayBook() {
        System.out.println(genre);
    }
}
