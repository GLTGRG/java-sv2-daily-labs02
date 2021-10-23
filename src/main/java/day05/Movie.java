package day05;

public class Movie {

    private String title;
    private int yearOfProduction;
    private double avgRating;
    private int sumOfRatings;
    private int sumOfVoters;

    public Movie(String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
    }

    public double rateMovie(int rating){
        sumOfRatings += rating;
        sumOfVoters++;
        avgRating = (sumOfRatings*1.0)/sumOfVoters;
        return avgRating;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getAvgRating() {
        return avgRating;
    }
}

