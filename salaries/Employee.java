package fr.salaries;

public abstract class Employee {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String date;

    public Employee(String firstName, String lastName, int age, String date){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.date = date;
    }

    public abstract double calculSalary();

    public String getTitle(){
        return "L'employé ";
    }

    public String getName(){
        return getTitle() + firstName + " " + lastName;
    }

}
