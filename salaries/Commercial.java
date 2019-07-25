package fr.salaries;

public abstract class Commercial extends Employee {

    private double grossSales;

    public Commercial(String firstName, String lastName, int age, String date, double grossSales) {
        super(firstName, lastName, age, date);
        this.grossSales = grossSales;
    }

    public double getGrossSales(){
        return grossSales;
    }
}
