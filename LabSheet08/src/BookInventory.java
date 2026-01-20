import javax.swing.*;

public class BookInventory {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            String book_title = JOptionPane.showInputDialog("Enter book title: ");
            int totalBook = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number: "));
            books[i] = new Book(book_title, totalBook);
            showInfo(books[i]);
        }
    }

    public static void showInfo(Book books) {
        System.out.println(books.getTitle() + " has " + books.getTotalBook() + " books, can borrow " + books.getTotalBook() + " books.");
    }
}
