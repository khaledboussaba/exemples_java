package fr.salaries;

public class Representative extends Commercial {

    private static final double REPRESENTATIVE_PERCENT = 0.2;
    private static final double REPRESENTATIVE_BONUS = 800;

    public Representative(String firstName, String lastName, int age, String date, double grossSales) {
        super(firstName, lastName, age, date, grossSales);
    }

    public double calculSalary() {
        return (getGrossSales() * REPRESENTATIVE_PERCENT) + REPRESENTATIVE_BONUS;
    }

    public String getTitle(){
        return "Le représentant ";
    }
}
