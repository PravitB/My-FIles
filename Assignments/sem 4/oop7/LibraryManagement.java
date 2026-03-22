// 17. Consider a Library Management System, where a user wants to find a book.

class BookNotFoundException extends Exception {
    BookNotFoundException(String message) {
        super(message);
    }
}

public class LibraryManagement {
    private static String[] books = {"Java Programming", "Data Structures", "Algorithms", "Database Systems", "Web Development"};

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a book name to search");
            return;
        }

        try {
            String bookName = args[0];
            findBook(bookName);
            System.out.println("Book found: " + bookName);

        } catch (BookNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void findBook(String bookName) throws BookNotFoundException {
        for (String book : books) {
            if (book.equalsIgnoreCase(bookName)) {
                return; // Book found
            }
        }
        throw new BookNotFoundException("Book '" + bookName + "' not found in library");
    }
}
