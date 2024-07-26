import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        //Creating an ArrayList to store the Book objects
        ArrayList<Book> books = new ArrayList<>();

        //Creating a Scanner object to read the user's input
        Scanner scanner = new Scanner(System.in);

        //Using a while loop to collect the inputs from the user until finished
        while (true) {
            //Asking the user for the book title
            System.out.print("Enter the title of the book (or press enter to stop): ");
            //Reading the user's input and storing it as a string
            String title = scanner.nextLine();

            //Check if the user's input is empty and if so breaking the loop
            if (title.isEmpty()) {
                break;
            }

            //Asking the user for the number of pages
            System.out.print("Enter the number of pages: ");
            //Reading the user's input and storing it as an integer
            int pages = Integer.parseInt(scanner.nextLine());

            //Asking the user for the publication year
            System.out.print("Enter the publication year: ");
            //Reading the user's input and storing it as an integer
            int publicationYear = Integer.parseInt(scanner.nextLine());

            //Creating a new book object
            Book book = new Book(title, pages, publicationYear);
            //Adding the new book object to the ArrayList
            books.add(book);
        }

        //Asking the user what should be printed once the loop ends
        System.out.print("What information would you like to print? (type 'everything' or 'name'): ");
        //Reading the user's input and storing it as a String
        String printOption = scanner.nextLine().toLowerCase();

        //Printing the book details based on the user's choice
        if (printOption.equals("everything")) {
            //Printing all details of each book
            System.out.println("Book Details:");
            //Using an enhanced for loop to iterate through every book in the list
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (printOption.equals("name")) {
            //Printing only the titles of the books
            System.out.println("Book Titles:");
            //Using an enhanced for loop to iterate through every book in the list
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Invalid option. Please enter 'everything' or 'name'.");
        }
    }
}

