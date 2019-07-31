package fr.conversion;

import java.util.Scanner;

public class Caractere2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {

        System.out.print("Entrez une seule lettre A..Z ou a..z : ");
        char c = scanner.next().charAt(0);

        if (( c <= 'z' ) && ( c >='a')){
            c = (char) ((int)c + (int)'Z' - (int)'z');
            System.out.println("Version majuscule : " + c);
        } else if (( c <= 'Z' )&& ( c >= 'A')){
            c=(char)((int)c - (int)'Z' + (int)'z');
            System.out.println("Version minuscule : " + c);
        } else {
            System.out.println("Caractère non valable");
        }
    }
}
