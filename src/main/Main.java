package main;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Cars",new ChildrenMovie()));
        movieList.add(new Movie("Pirates",new RegularMovie()));
        movieList.add(new Movie("Fast&Furious",new NewReleasedMovie()));

        Customer customer = new Customer("Sergey");
        customer.addRental(new Rental(movieList.get(0),4));
        customer.addRental(new Rental(movieList.get(1),3));
        customer.addRental(new Rental(movieList.get(2),2));
        customer.statement();
    }
}
