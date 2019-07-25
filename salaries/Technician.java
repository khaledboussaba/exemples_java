package fr.salaries;

public class Technician extends Employee {

    private static final double UNITY_FACTOR = 5.0;
    private int unityProduct;

    public Technician(String firstName, String lastName, int age, String date, int unityProduct) {
        super(firstName, lastName, age, date);
        this.unityProduct = unityProduct;
    }

    public double calculSalary() {
        return unityProduct * UNITY_FACTOR;
    }

    public String getTitle(){
        return "Le technicien ";
    }
}
