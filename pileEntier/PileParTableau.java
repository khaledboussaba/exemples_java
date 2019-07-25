package fr.pileEntier;

public class PileParTableau implements Pile {
    private int tailleMax = 1000;   // Taille maximale
    private int sommet = -1;        // Sommet du tableau
    private int[] tableau;

    public PileParTableau(int max) {
        tailleMax = max;
        sommet = -1;
        tableau = new int [tailleMax];
    }

    @Override
    public void effacer() {
        sommet = -1;
    }

    @Override
    public void empiler(int element) {
        if (sommet == tailleMax - 1) {
            System.out.println("Impossible d'empiler: la pile est pleine");
            System.exit(-1);
        }

        sommet++;
        tableau[sommet] = element;
    }

    @Override
    public void depiler() {
        if (isPileVide()) {
            System.out.println("Impossible de desempiler: la pile est vide");
            System.exit(-1);
        }

        sommet--;
    }

    @Override
    public boolean isPileVide() {
        return (sommet == -1);
    }

    @Override
    public int sommet() {
        if (isPileVide()) {
            System.out.println("Impossible de donner la valeur du sommet: la pile est vide");
            System.exit(-1);
        }

        return tableau[sommet];
    }
}
