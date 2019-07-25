package fr.salaries;

import java.util.ArrayList;
import java.util.List;

public class Staff {

    private Employee[] staff;
    private int employeesNumber;
    private final static int MAX_EMPLOYEES = 200;

    public Staff() {
        staff = new Employee[MAX_EMPLOYEES];
        employeesNumber = 0;
    }

    public void addEmployee(Employee employee){
        ++employeesNumber;
        if (employeesNumber < MAX_EMPLOYEES){
            staff[employeesNumber - 1] = employee;
        } else {
            System.out.println("Pas plus de " + MAX_EMPLOYEES + " employés");
        }
    }

    public void calculSalaries(){
        for (int i = 0; i < employeesNumber; i++){
            System.out.println(staff[i].getName() + " gagne " + staff[i].calculSalary() + " francs.");
        }
    }

    public double averageSalary(){
        double totalSalary = 0;
        for (int i = 0; i < employeesNumber; i++){
            totalSalary += staff[i].calculSalary();
        }
        return totalSalary / employeesNumber;
    }

}
