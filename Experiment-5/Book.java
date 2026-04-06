package LibraryManagement;

public class Book {

    String title;
    String author;
    String isbn;

    public Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}