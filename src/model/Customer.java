package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public File statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        StringBuilder result = new StringBuilder();

        result.append("<html>\n<body>\n");
        result.append("<h3>Учет аренды для " + getName() + "</h3>\n");

        for (Rental rental : rentals) {
            double thisAmount = rental.getMovie().getAmount(rental);
            frequentRenterPoints += rental.getMovie().getFrequentRenterPoint(rental);

            result.append("\t" + rental.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n");
            totalAmount += thisAmount;
        }
        result.append("<br>Сумма задолженности составляет: <b>" +
                String.valueOf(totalAmount) + "</b>\n");
        result.append("<br>Вы заработали " + String.valueOf(frequentRenterPoints) +
                " очков за активность\n</body>\n</html>");

        File report = new File("RP_" + getName() + ".html");

        try {
            FileWriter fileWriter = new FileWriter(report);

            fileWriter.write(String.valueOf(result));
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return report;
    }
}
