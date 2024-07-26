import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        //Creating an ArrayList to store the Animal objects
        ArrayList<Animal> animals = new ArrayList<>();

        //Creating a Scanner object to read the user's input
        Scanner scanner = new Scanner(System.in);

        //Printing the title of the program and the directions for the how to break the loop
        System.out.println("Animal Menu");
        System.out.println("Press 'enter' to stop");

        //Using a while loop to read the inputs from the user until finished
        while (true) {
            //Asking the user for the name of the animal
            System.out.print("Please enter a name: ");
            //Reading the user's input and storing it as a string
            String name = scanner.nextLine();

            //Check if the user's input is empty and if so breaking the loop
            if (name.isEmpty()) {
                break;
            }

            //Asking the user if the animal is a dog or not
            System.out.print("Is it a dog? (yes or no): ");
            //Reading the user's input and storing it as a string
            String input = scanner.nextLine().toLowerCase();

            //Assigning isDog as a Boolean variable based on user input
            boolean isDog = input.equals("yes");

            //Creating a new Animal object
            Animal animal = new Animal(name, isDog);
            //Adding the new animal object to the ArrayList
            animals.add(animal);
        }

        //Printing the details of each animal in the list after the program is finished
        System.out.println("List of Animals:");
        //Using an enhanced for loop to iterate through every animal in the list
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}

