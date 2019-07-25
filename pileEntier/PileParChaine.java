package fr.pileEntier;

public class PileParChaine implements Pile {

    /** Base de la pile */
    private Node root = new Node(null, 0);

    /** Sommet de la pile */
    private Node sommet = root;


    @Override
    public void effacer() {
        sommet = root;
    }

    @Override
    public void empiler(int element) {
        Node newTop = new Node(sommet, element);
        sommet = newTop;
    }

    @Override
    public void depiler() {
        if (sommet == root) {
            System.out.println("La pile est vide");
            System.exit(-1);
        } else
            sommet = sommet.getPreviousElement();
    }

    @Override
    public boolean isPileVide() {
        return (sommet == root);
    }

    @Override
    public int sommet() {
        return sommet.getValue();
    }
}
