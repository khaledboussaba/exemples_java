package fr.nombrePairOuImpair;

import java.util.Scanner;

public class PairImpair {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entrez un nombre entier : ");
        int number = scanner.nextInt();

        if (number == 0){
            System.out.println("Le nombre est zéro (et il est POSITIF)");
        } else if (number < 0){
            if (number % 2 == 0){
                System.out.println("Le nombre est NEGATIF et PAIR");
            } else {
                System.out.println("Le nombre est NEGATIF et IMPAIR");
            }
        } else {
            if (number % 2 == 0){
                System.out.println("Le nombre est POSITIF et PAIR");
            } else {
                System.out.println("Le nombre est POSITIF et IMPAIR");
            }
        }

    }

}
