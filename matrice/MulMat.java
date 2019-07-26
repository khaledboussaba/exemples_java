package fr.matrice;

import java.util.Scanner;

public class MulMat {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int lignes = 0;
        int colonnes = 0;

        // Matrice 1
        System.out.println("Saisie de la 1ere matrice :");
        do {
            System.out.print("Nombre de lignes : ");
            lignes = scanner.nextInt();
        }while (lignes < 1);
        do {
            System.out.print("Nombre de colonnes : ");
            colonnes = scanner.nextInt();
        }while (colonnes < 1);

        double[][] mat1 = new double[lignes][colonnes];
        for (int row = 0; row < lignes; row++){
            for (int col = 0; col < colonnes; col++){
                System.out.print("  M[" + (row+1) + "," + (col+1) + "] = ");
                mat1[row][col] = scanner.nextDouble();
            }
        }

        // Matrice 2 (meme chose)
        System.out.println("Saisie de la 2eme matrice :");
        do {
            System.out.print("Nombre de lignes : ");
            lignes = scanner.nextInt();
        }while (lignes < 1);
        do {
            System.out.print("Nombre de colonnes: ");
            colonnes = scanner.nextInt();
        }while (colonnes < 1);

        double[][] mat2 = new double[lignes][colonnes];
        for (int row = 0; row < lignes; row++){
            for (int col = 0; col < colonnes; col++){
                System.out.print("  M[" + (row+1) + "," + (col+1) + "] = ");
                mat2[row][col] = scanner.nextDouble();
            }
        }

        //Mutiplication mat1 et mat2
        if (mat1[0].length != mat2.length){
            System.out.println("Multiplication de matrices impossible !");
        } else {
            double[][] prod = new double[mat1.length][mat2[0].length];
            for (int row = 0; row < mat1.length; row++){
                for (int col = 0; col < mat2[0].length; col++){
                    prod[row][col] = 0.0;
                    for (int i = 0; i < mat2.length; i++){
                        prod[row][col] += mat1[row][i] * mat2[i][col];
                    }
                }
            }

            //Affichage prod
            System.out.println("Résultat : ");
            for (int row = 0; row < prod.length; row++){
                for (int col = 0; col < prod[row].length; col++){
                    System.out.print(prod[row][col] + " ");
                }
                System.out.println();
            }
        }

    }
}
