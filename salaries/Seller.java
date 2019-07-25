package fr.salaries;

public class Seller extends Commercial {

    private static final double SELLER_PERCENT = 0.2;
    private static final double SELLER_BONUS = 400;

    public Seller(String firstName, String lastName, int age, String date, double grossSales) {
        super(firstName, lastName, age, date, grossSales);
    }

    public double calculSalary() {
        return (getGrossSales() * SELLER_PERCENT) + SELLER_BONUS;
    }

    public String getTitle(){
        return "Le vendeur ";
    }

}
