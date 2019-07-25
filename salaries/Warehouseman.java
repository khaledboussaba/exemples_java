package fr.salaries;

public class Warehouseman extends Employee {

    private static final double HOUR_SALARY = 65.0;
    private int hoursWorked;

    public Warehouseman(String firstName, String lastName, int age, String date, int hoursWorked) {
        super(firstName, lastName, age, date);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculSalary() {
        return hoursWorked * HOUR_SALARY;
    }

    public String getTilte(){
        return "Le manutentionnaire ";
    }
}
