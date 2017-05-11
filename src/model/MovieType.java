package model;

/**
 * Created by mozilla9025 on 5/6/17.
 */
public interface MovieType {

    double getAmount(Rental rental);
    int getFrequentRenterPoint(Rental rental);
}
