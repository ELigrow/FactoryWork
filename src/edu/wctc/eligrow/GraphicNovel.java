package edu.wctc.eligrow;

public class GraphicNovel implements IBook {
    String author;
    boolean isEpic;

    public GraphicNovel() {
        author = "Stan Lee";
        isEpic = true;
    }

    @Override
    public void displayBook() {
        System.out.println(author + "'s graphic novel is " + (isEpic?"awesome!!!":"lame."));
    }
}
