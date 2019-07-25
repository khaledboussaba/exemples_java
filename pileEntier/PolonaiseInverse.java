package fr.pileEntier;

import java.util.Scanner;

public class PolonaiseInverse {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String s;

        do {
            System.out.print("Entrez une expression à évaluer : ");
            s = scanner.nextLine();
            if (!(s.length() == 0)) {
                System.out.println(" -> résultat : " + eval(s));
            }
        } while (!(s.length() == 0));
    }

    static int eval(String s) {
        Pile p = new PileParTableau(100);

        // Recopie dans la pile
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= '0') && (c <= '9')) {
                // On a lu un opérande
                p.empiler((int) (c - '0'));
                } else if ((c == '+') || (c == '-') || (c == '*') || (c == '/')) {
                // On a lu un opérateur

                // Récupère le second argument
                int y = 0;
                int x = 0;
                if (!p.isPileVide()) {
                    y = p.sommet();
                    p.depiler();
                } else {
                    System.out.println("Expression incomplète");
                    return 0;
                }

                // Récupère le premier argument
                if (!p.isPileVide()) {
                    x = p.sommet();
                    p.depiler();
                } else {
                    System.out.println("Expression incomplète");
                    return 0;
                }

                // Calcule et empile le résultat
                int n = 0;
                switch (c) {
                    case '+':
                        n = x + y;
                        break;
                    case '-':
                        n = x - y;
                        break;
                    case '*':
                        n = x * y;
                        break;
                    case '/':
                        n = x / y;
                        break;
                }
                p.empiler(n);
            }
        }

        return p.sommet();
    }

}
