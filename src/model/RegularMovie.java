package model;

/**
 * Created by mozilla9025 on 5/6/17.
 */
public class RegularMovie implements MovieType {
    @Override
    public double getAmount(Rental rental) {
        return 2 + (rental.getDaysRented() > 2 ? (rental.getDaysRented() - 2) * 1.5 : 0);
    }

    @Override
    public int getFrequentRenterPoint(Rental rental) {
        return 1;
    }
}
