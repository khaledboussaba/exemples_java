package fr.rectangle;

import java.util.Scanner;

public class Rectangle {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        double largeur = lireDonnee("largeur");
        double hauteur = lireDonnee("hauteur");

        boolean donneesOk = testerDonnees(largeur, hauteur);

        if (donneesOk) {
            calculer(largeur, hauteur);
        } else {
            afficherErreur();
        }
    }

    static double lireDonnee(String text){
        System.out.print("Entrez la " + text + " : ");
        return scanner.nextDouble();
    }

    static boolean testerDonnees(double largeur, double hauteur){
        return ((largeur > 0) && (hauteur > 0));
    }
    static void calculer(double largeur, double hauteur){
        System.out.print("Surface ('s/S') ou perimètre ('p/P')?: ");
        char typeCalcul = scanner.next().charAt(0);
        switch (typeCalcul){
            case 's':
            case 'S':
                double surface = largeur * hauteur;
                System.out.println("La surface est " + surface);
                break;
            case 'p':
            case 'P':
                double perimetre = (largeur + hauteur) * 2;
                System.out.println("Le périmètre est " + perimetre);
                break;
            default:
                System.out.println ("Introduire un 'p' ou un 's' s.v.p");
                break;
        }
    }

    static void afficherErreur(){
        System.out.println("vous avez introduit une largeur ou une hauteur négative!");
    }
}