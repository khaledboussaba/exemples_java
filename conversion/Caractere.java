package fr.conversion;

import java.util.Scanner;

public class Caractere {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez une seule lettre A..Z ou a..z : ");
        char c = scanner.next().charAt(0);
        if ((int) c >= 65 && (int) c <= 90){
            System.out.println("Version minuscule : " + (char)(c+32));
        }else if ((int) c >= 97 && (int) c <= 122){
            System.out.println("Version majuscule : " + (char)(c-32));
        }else{
            System.out.println("Caractère non valable");
        }
    }
}
