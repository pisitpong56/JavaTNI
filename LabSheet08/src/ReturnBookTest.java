import javax.swing.*;

public class ReturnBookTest {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 5);

        boolean running = true;

        while (running) {
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want to borrow/return book?",
                    "Borrow/Return Book",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                String press_number = JOptionPane.showInputDialog(
                        "Press 1 to borrow book" + "\nPress 2 to return book");

                if (press_number.equals("1")) {
                    if (book.getAvailableBook() == 0) {
                        JOptionPane.showMessageDialog(null,
                                "No books available to borrow...",
                                "Warning Message",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        book.borrowBook();
                        System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books.");
                    }
                } else if (press_number.equals("2")) {
                    if (book.getAvailableBook() == 5) {
                        JOptionPane.showMessageDialog(null,
                                "Cannot return! All books are already here.",
                                "Warning Message",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        book.returnBook();
                        System.out.println("Returned 1 book, available " + book.getAvailableBook() + " books.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "END PROGRAM");
                    running = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "END PROGRAM");
                running = false;
            }
        }
    }
}

