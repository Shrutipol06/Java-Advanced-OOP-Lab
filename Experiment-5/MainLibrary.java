import LibraryManagement.Book;
import LibraryManagement.Member;

public class MainLibrary {

    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "James Gosling", "12345");
        Member m1 = new Member("Rahul", 101);

        b1.displayBook();
        m1.displayMember();
    }
}