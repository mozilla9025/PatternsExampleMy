package model;

/**
 * Created by mozilla9025 on 5/6/17.
 */
public class ChildrenMovie implements MovieType {
    @Override
    public double getAmount(Rental rental) {
        return 1.5 + (rental.getDaysRented() > 3 ? (rental.getDaysRented() - 3) * 1.5 : 0);
    }

    @Override
    public int getFrequentRenterPoint(Rental rental) {
        return 1;
    }
}
