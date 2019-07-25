package fr.surface;

import java.util.Scanner;

class Surfaces2 {

    public static void main(String[] args) {
        // Construction d'un terrain:
        Terrain2 t = new Terrain2(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
        t.afficherSurfaceTotale();
    }

}

class Terrain2 {
    private static Scanner scanner = new Scanner(System.in);

    private Rectangle2 r1;
    private Rectangle2 r2;
    private Rectangle2 r3;
    private Cercle2 c1;
    private Cercle2 c2;

    public Terrain2(double l1, double h1, double l2, double h2, double l3, double h3, double x1, double x2) {
        r1 = new Rectangle2(l1, h1);
        r2 = new Rectangle2(l2, h2);
        r3 = new Rectangle2(l3, h3);
        c1 = new Cercle2(x1);
        c2 = new Cercle2(x2);
    }

    private double calculerSurfaceTotale() {
        return r1.calculerSurface() + r2.calculerSurface() + r3.calculerSurface() + c1.calculerSurface() + c2.calculerSurface();
    }

    public void afficherSurfaceTotale() {
        double surfaceTotale = calculerSurfaceTotale();
        System.out.println("La surface totale est " + surfaceTotale);
    }
}

class Rectangle2 {
    private double largeur;
    private double hauteur;

    public Rectangle2(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public double calculerSurface() {
        return (largeur * hauteur);
    }
}

class Cercle2{
    private double rayon;

    public Cercle2(double rayon){
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public double calculerSurface() {
        return (Math.PI * rayon * rayon);
    }
}
