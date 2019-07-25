package fr.salaries;

public class TechnRisk extends Technician implements EmployeeRisk {


    public TechnRisk(String firstName, String lastName, int age, String date, int unityProduct) {
        super(firstName, lastName, age, date, unityProduct);
    }

    public double calculSalary() {
        return super.calculSalary() + bonus;
    }
}
