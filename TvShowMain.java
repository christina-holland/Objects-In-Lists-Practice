import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        //Creating an ArrayList to store the TvShow objects
        ArrayList<TvShow> tvShows = new ArrayList<>();

        //Creating a Scanner object to read the user's input
        Scanner scanner = new Scanner(System.in);

        //Using a while loop to read the inputs from the user until finished
        while (true) {
            //Asking for the show name
            System.out.println("Name of the TV show (press enter to stop): ");
            //Reading the user's input and saving it as a string
            String showName = scanner.nextLine();

            //Checking if the user's input is empty and if so breaking the loop
            if (showName.isEmpty()) {
                break;
            }

            //Asking for the number of episodes
            System.out.println("How many episodes? ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            //Asking for the genre of the TV show
            System.out.println("What is the genre? ");
            String genre = scanner.nextLine();

            //Creating a new TvShow object
            TvShow tvShow = new TvShow(showName, numberOfEpisodes, genre);
            //Adding the new TvShow object to the ArrayList
            tvShows.add(tvShow);
        }

        //Printing the details of each TV show in the list
        System.out.println("List of TV Shows:");
        //Using an enhanced for loop to iterate through every TV show in the list
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}

