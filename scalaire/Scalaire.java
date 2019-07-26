package fr.scalaire;

import java.util.Scanner;

public class Scalaire {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int nMax = 10;
        int n;

        do {
            System.out.print("Quelle est la taille pour vos vecteurs [ entre 1 et " + nMax + "] ? ");
            n = scanner.nextInt();
        } while (n < 1 || n > nMax);

        double[] v1 = new double[n];
        double[] v2 = new double[n];

        System.out.println("Veuillez entrez les composantes du vecteur v1 : ");

        for (int i = 0; i < n ; i++){
            System.out.print("v1[" + i +"] = ");
            v1[i] = scanner.nextDouble();
        }

        System.out.println("Veuillez entrez les composantes du vecteur v2 : ");
        for (int i = 0; i < n ; i++){
            System.out.print("v2[" + i +"] = ");
            v2[i] = scanner.nextDouble();
        }

        double produit = 0.0;
        for (int i = 0; i < n ; i++){
            produit += v1[i] * v2[i];
        }
        System.out.println("Le produit scalaire des vecteurs v1 et v2 vaut : " + produit);

    }
}
