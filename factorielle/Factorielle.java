package fr.factorielle;

import java.util.Scanner;

public class Factorielle {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char recommencer = 'o';
        do {
            int nombre = demanderNombre();

            System.out.println("Méthode itérative :");
            System.out.println(nombre + "! = " + factorielleIterative(nombre));

            System.out.println("Méthode récursive :");
            System.out.println(nombre + "! = " + factorielleRecursive(nombre));

            System.out.print("Voulez-vous recommencer [o/n] ? ");
            recommencer = scanner.next().charAt(0);
        } while (recommencer == 'o');


    }

    static int demanderNombre(){
        int nombre;
        do {
            System.out.print("Entrez un nombre entier compris entre 0 et 12 : ");
            nombre = scanner.nextInt();
        }while (nombre < 0 || nombre > 12);
        return nombre;
    }

    static int factorielleIterative(int nombre){
        int fact = 1;
        for (int i = 2; i <= nombre; i ++){
            fact *= i;
        }
        return fact;
    }

    static int factorielleRecursive(int nombre){
        if (nombre == 0)
            return  1;
        else
            return nombre * factorielleRecursive(nombre -1);
    }
}
