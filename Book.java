public class Book {
    //Creating the attributes for the book title, number of pages, and publication year
    private String title;
    private int pages;
    private int publicationYear;

    //Creating a constructor to initialize the Book object with the three attributes
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    //Creating a method to get the Book title attribute
    public String getTitle() {
        return title;
    }

    //Creating a method to get the number of pages attribute
    public int getPages() {
        return pages;
    }

    //Creating a method to get the publication year attribute
    public int getPublicationYear() {
        return publicationYear;
    }

    //Overriding the toString method to return the book details
    @Override
    public String toString() {
        return "Title: " + title + ", Pages: " + pages + ", Publication Year: " + publicationYear;
    }
}

