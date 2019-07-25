package fr.pileEntier;

public interface Pile {

    /** Effacer tous les éléments */
    void effacer();

    /** Empiler une valeur au sommet de la pile */
    void empiler(int element);

    /** Dépiler la valeur du sommet de la pile */
    void depiler();

    /** Teste si la pile est vide */
    boolean isPileVide();

    /** Retourne la valeur du sommet de la pile */
    int sommet();

}
