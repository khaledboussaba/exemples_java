package fr.taxe;

import java.util.ArrayList;
import java.util.List;

public class Taxe {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture("Toyota", 1598);
        Voiture voiture2 = new Voiture("BMW", 2756);
        List<Voiture> voitures = new ArrayList<>();
        voitures.add(voiture1);
        voitures.add(voiture2);
        Flotte flotte = new Flotte(voitures);
        flotte.afficherVoiture();
        flotte.afficherTaxeFlotte();
    }
}

class Flotte {
    private List<Voiture> voitures;

    public Flotte(List<Voiture> voitures) {
        this.voitures = voitures;
    }

    public void afficherVoiture(){
        for (Voiture voiture : voitures) {
            voiture.afficherVoiture();
        }
    }

    public void afficherTaxeFlotte(){
        double taxe = calculerTaxeFlotte();
        System.out.println("Taxe totale à payer: " + taxe + " francs.");
    }
    public double calculerTaxeFlotte(){
        double taxe = 0;
        for (Voiture voiture: voitures) {
            taxe += voiture.CalculerTaxeVoiture();
        }
        return taxe;
    }
}

class Voiture {
    private String marque;
    private int cylindree;

    public Voiture(String marque, int cylindree) {
        this.marque = marque;
        this.cylindree = cylindree;
    }

    public void afficherVoiture(){
        System.out.println("Vous avez une " + marque + " de cylindrée " + cylindree);
    }

    public double CalculerTaxeVoiture(){
        double taxe;
        if (cylindree <= 1600)
            taxe = 300.0;
        else if (cylindree <= 2300)
            taxe = 500.0;
        else
            taxe = 700.0;
        return taxe;
    }
}
