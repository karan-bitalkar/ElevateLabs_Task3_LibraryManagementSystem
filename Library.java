import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("✅ Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }
        System.out.println("\n📚 List of Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void addUser() {
        System.out.print("Enter User ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        users.add(new User(id, name));
        System.out.println("✅ User added successfully!");
    }

    public void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int bookId = sc.nextInt();
        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();

        Book foundBook = null;
        for (Book b : books) {
            if (b.getId() == bookId && !b.isIssued()) {
                foundBook = b;
                break;
            }
        }

        if (foundBook != null) {
            foundBook.setIssued(true);
            System.out.println("📘 Book issued successfully to User ID: " + userId);
        } else {
            System.out.println("❌ Book not found or already issued!");
        }
    }

    public void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int bookId = sc.nextInt();

        for (Book b : books) {
            if (b.getId() == bookId && b.isIssued()) {
                b.setIssued(false);
                System.out.println("✅ Book returned successfully!");
                return;
            }
        }
        System.out.println("❌ Book not found or not issued!");
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("📚 Welcome to Library Management System 📚");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add User");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> library.addBook();
                case 2 -> library.viewBooks();
                case 3 -> library.addUser();
                case 4 -> library.issueBook();
                case 5 -> library.returnBook();
                case 6 -> {
                    running = false;
                    System.out.println("👋 Thank you for using Library Management System!");
                }
                default -> System.out.println("⚠️ Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
