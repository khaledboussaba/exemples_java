package fr.surface;

class Surfaces {
    public static void main (String[] args) {
        // Construction d'un terrain:
        Terrain t = new Terrain();

        t.ajouterForme(new Rectangle(100, 100));
        t.ajouterForme(new Cercle(50));

        t.afficherSurfaceTotale();
    }
}

class Terrain{

    private Forme[] liste;
    private int nbFormes = 0;

    public Terrain(){
        liste = new Forme[10];
    }

    public boolean ajouterForme(Forme forme){
        if (nbFormes < liste.length){
            liste[nbFormes] = forme;
            nbFormes++;
            return true;
        }else {
            return false;
        }
    }

    private double calculerSurfaceTotale(){
        double somme = 0.0;
        for (int i = 0; i < nbFormes; i++){
            somme += liste[i].calculerSurface();
        }
        return somme;
    }

    public void afficherSurfaceTotale(){
        double surfaceTotale = calculerSurfaceTotale();
        System.out.println("La surface totale est : " + surfaceTotale);
    }

}

abstract class Forme{
    public abstract double calculerSurface();
}

class Rectangle extends Forme {

    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double calculerSurface() {
        return largeur * hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
}

class Cercle extends Forme {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}