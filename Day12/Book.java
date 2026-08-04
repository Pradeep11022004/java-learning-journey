
public class Book {

    String title = "KILLING FLOOR";
    String author = "LEE CHILD";
    int price = 399;

    void displayBook() {
        System.out.println("Book Title : " + title);
        System.out.println("Author Name: " + author);
        System.out.println("Book Price : " + price);
    }

    public static void main(String[] args) {

        Book book = new Book();
        book.displayBook();
    }
}
