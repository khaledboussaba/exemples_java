package fr.permutation;

import java.util.Scanner;

public class Permutation {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entez x : ");
        int x = scanner.nextInt();

        System.out.print("Entez y : ");
        int y = scanner.nextInt();

        System.out.println("Avant permutation: ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        int z = x;
        x = y;
        y = z;

        System.out.println("Après permutation: ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
