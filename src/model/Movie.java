package model;

public class Movie {

    private MovieType movieType;
    private String title;

    public Movie(String title, MovieType movieType) {
        this.title = title;
        this.movieType = movieType;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount(Rental rental){
        return movieType.getAmount(rental);
    }

    public int getFrequentRenterPoint(Rental rental){
        return movieType.getFrequentRenterPoint(rental);
    }
}
