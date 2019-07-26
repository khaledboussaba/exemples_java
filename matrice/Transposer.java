package fr.matrice;

import java.util.Scanner;

public class Transposer {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Donnez la dimension de la matrice :");
        int size = scanner.nextInt();

        int[][] mat = new int[size][size];
        int[][] tam = new int[size][size];

        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col++){
                System.out.print("Entrez un nombre entier pour la rangée " + row + " et la colonne " + col + " :");
                mat[row][col] = scanner.nextInt();
                tam[col][row] = mat[row][col];
            }
        }

        System.out.println(" La matrice originale  est : ");
        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col++){
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println(" La matrice transposée est : ");
        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col++){
                System.out.print(tam[row][col] + " ");
            }
            System.out.println();
        }
    }
}
