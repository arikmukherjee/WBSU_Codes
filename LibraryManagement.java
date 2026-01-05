// Base Class - Library
class Library {
    String libraryName;
    String libraryAddress;

    void setLibraryDetails(String name, String address) {
        libraryName = name;
        libraryAddress = address;
    }

    void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Library Address: " + libraryAddress);
    }
}

// Intermediate Class - Book
class Book extends Library {
    String bookTitle;
    String author;

    void setBookDetails(String title, String author) {
        bookTitle = title;
        this.author = author;
    }

    void displayBookDetails() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
    }
}

// Derived Class - IssuedBook
class IssuedBook extends Book {
    String issuedTo;
    String issueDate;

    void setIssuedBookDetails(String issuedTo, String issueDate) {
        this.issuedTo = issuedTo;
        this.issueDate = issueDate;
    }

    void displayIssuedBookDetails() {
        System.out.println("Issued To: " + issuedTo);
        System.out.println("Issue Date: " + issueDate);
    }
}

// Main Class
public class LibraryManagement {
    public static void main(String[] args) {
        IssuedBook issuedBook = new IssuedBook();

        // Set details
        issuedBook.setLibraryDetails("City Central Library", "123 Main Street");
        issuedBook.setBookDetails("The Great Gatsby", "F. Scott Fitzgerald");
        issuedBook.setIssuedBookDetails("Alice Johnson", "2025-05-06");

        // Display all details
        System.out.println("=== Library Information ===");
        issuedBook.displayLibraryDetails();

        System.out.println("\n=== Book Information ===");
        issuedBook.displayBookDetails();

        System.out.println("\n=== Issued Book Information ===");
        issuedBook.displayIssuedBookDetails();
    }
}
