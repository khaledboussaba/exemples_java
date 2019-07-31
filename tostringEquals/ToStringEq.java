package fr.tostringEquals;

public class ToStringEq {

    public static void main(String[] args) {
        System.out.println("Test 1 :");
        Rectangle rect = new Rectangle(12.5, 4.0);
        System.out.println(rect);
        System.out.println();

        System.out.println("Test 2: ");
        // le type de rect1 est RectangleColore
        // l'objet contenu dans rect1 est de type RectangleColore
        RectangleColore rect1 = new RectangleColore(12.5, 4.0, "rouge");
        System.out.println(rect1);
        System.out.println();

        System.out.println("Test 3 :");

        // le type de rect2 est Rectangle
        // l'objet contenu dans rect2 est de type RectangleColore
        Rectangle  rect2 = new RectangleColore(25.0/2, 8.0/2, new String("rouge"));
        System.out.println(rect2);

        System.out.println (rect1.equals(rect2)); // 1.
        System.out.println (rect2.equals(rect1)); // 2.
        System.out.println(rect1.equals(null));   // 3.
        System.out.println (rect.equals(rect1));  // 4.
        System.out.println (rect1.equals(rect));  // 5.
    }
}

class Rectangle{

    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public String toString() {
        return "Rectangle : " + "\n\t largeur : " + this.largeur + "\n\t heuteur : " + this.hauteur;
    }

    public boolean equals(Object autreRect) {
        if (autreRect == null){
            return false;
        }
        else {
            if (autreRect.getClass() != getClass()){
                return false;
            }
            else{
                return (largeur == ((Rectangle)autreRect).largeur && hauteur == ((Rectangle)autreRect).hauteur);
            }
        }

    }
}

class RectangleColore extends Rectangle{
    private String couleur;


    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t couleur = " + this.couleur;
    }

    public boolean equals(RectangleColore autreRectColore) {
        if (autreRectColore == null){
            return false;
        }
        else if (autreRectColore.getClass() != getClass()){
            return false;
        }
        else {
            return (super.equals(autreRectColore) && couleur.equals(autreRectColore.couleur));
        }
    }
}