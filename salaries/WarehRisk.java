package fr.salaries;

public class WarehRisk extends Warehouseman implements EmployeeRisk {

    public WarehRisk(String firstName, String lastName, int age, String date, int hoursWorked) {
        super(firstName, lastName, age, date, hoursWorked);
    }

    public double calculSalary() {
        return super.calculSalary() + bonus;
    }
}
