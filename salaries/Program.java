package fr.salaries;

public class Program {

        public static void main(String[] args) {
            Staff p = new Staff();
            p.addEmployee(new Seller("Pierre", "Business", 45, "1995", 30000));
            p.addEmployee(new Representative("Léon", "Vendtout", 25, "2001", 20000));
            p.addEmployee(new Technician("Yves", "Bosseur", 28, "1998", 1000));
            p.addEmployee(new Warehouseman("Jeanne", "Stocketout", 32, "1998", 45));
            p.addEmployee(new TechnRisk("Jean", "Flippe", 28, "2000", 1000));
            p.addEmployee(new WarehRisk("Al", "Abordage", 30, "2001", 45));

            p.calculSalaries();
            System.out.println("Le salaire moyen dans l'entreprise est de "
                    + p.averageSalary() + " francs.");

        }

}
