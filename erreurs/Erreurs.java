package fr.erreurs;

class Erreurs {
    public static void main(String[] args) {
        GrillePain g1 = new GrillePain(1995, 2);
        g1.afficherVariables();
        GrillePain g2 = new GrillePain(1998, 4);
        g2.afficherVariables();
    }
}

class GrillePain {
    private int annee;
    private int nbTranches;

    public GrillePain(int annee, int nbTranches) {
        this.annee = annee;
        this.nbTranches = nbTranches;
    }

    public void afficherVariables() {
        System.out.println
                ("Objet de type GrillePain avec variables d'instance année = " +
                        annee + " et nbTranches = " + nbTranches);
    }
}
