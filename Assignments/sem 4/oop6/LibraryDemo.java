// 18. Library Management System with Interface and Multiple Classes

interface LibraryItem {
    void checkout();
    void returnItem();
    void displayInfo();
}

class Book implements LibraryItem {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
        available = true;
    }

    public void checkout() {
        if (available) {
            available = false;
            System.out.println("Book '" + title + "' checked out successfully");
        } else {
            System.out.println("Book '" + title + "' is not available");
        }
    }

    public void returnItem() {
        available = true;
        System.out.println("Book '" + title + "' returned successfully");
    }

    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + " (ISBN: " + isbn + "), Available: " + available);
    }
}

class Magazine implements LibraryItem {
    private String title;
    private int issueNumber;
    private boolean available;

    Magazine(String t, int issue) {
        title = t;
        issueNumber = issue;
        available = true;
    }

    public void checkout() {
        if (available) {
            available = false;
            System.out.println("Magazine '" + title + "' Issue #" + issueNumber + " checked out");
        } else {
            System.out.println("Magazine is not available");
        }
    }

    public void returnItem() {
        available = true;
        System.out.println("Magazine '" + title + "' returned successfully");
    }

    public void displayInfo() {
        System.out.println("Magazine: " + title + " Issue #" + issueNumber + ", Available: " + available);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem book = new Book("Java Programming", "John Smith", "ISBN123");
        LibraryItem magazine = new Magazine("TechWeekly", 45);

        book.displayInfo();
        magazine.displayInfo();

        book.checkout();
        magazine.checkout();

        book.displayInfo();
        magazine.displayInfo();

        book.returnItem();
        magazine.returnItem();

        book.displayInfo();
        magazine.displayInfo();
    }
}
