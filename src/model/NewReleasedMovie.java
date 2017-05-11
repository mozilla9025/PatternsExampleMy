package model;

/**
 * Created by mozilla9025 on 5/6/17.
 */
public class NewReleasedMovie implements MovieType {
    @Override
    public double getAmount(Rental rental) {
       return rental.getDaysRented() * 3;
    }

    @Override
    public int getFrequentRenterPoint(Rental rental) {
        return rental.getDaysRented() <= 2 ? 1 : 0;
    }
}
