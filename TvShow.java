public class TvShow {
    //Creating the attributes for the show name, number of episodes, and genre
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    //Creating a constructor to initialize the TvShow object with the three attributes
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    //Creating a method to get the show name attribute
    public String getShowName() {
        return showName;
    }

    //Creating a method to get the number of episodes attribute
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    //Creating a method to get the genre attribute
    public String getGenre() {
        return genre;
    }

    //Overriding the toString method to return the details of the TV show
    @Override
    public String toString() {
        return getShowName() + " has " + getNumberOfEpisodes() + " episodes. The genre is " + getGenre() + ".";
    }
}

