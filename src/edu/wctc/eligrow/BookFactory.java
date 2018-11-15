package edu.wctc.eligrow;

public class BookFactory {

    public IBook getBook(BookType bookType) {
        switch (bookType) {
            case BIOGRAPHY:
                return new Biography();
            case FICTION:
                return new Fiction();
            case GRAPHICNOVEL:
                return new GraphicNovel();
            default:
                return null;
        }
    }
}
