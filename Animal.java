public class Animal {
    //Creating the attributes for the animal's name and whether it is a dog
    private String name;
    private boolean isDog;

    //Creating a constructor to initialize the animal object with name and isDog attributes
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    //Creating a method to get the name attribute
    public String getName() {
        return name;
    }

    //Creating a method to get the isDog attribute
    public boolean isDog() {
        return isDog;
    }

    //Overriding the toString method to return a string representation of the animal
    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }
}

