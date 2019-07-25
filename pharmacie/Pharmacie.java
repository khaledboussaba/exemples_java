package fr.pharmacie;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import javafx.scene.paint.Stop;

import java.util.Scanner;
class Pharmacie {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String args[]) {
        Client[]  clients = new Client[2];
        Medicament[]  medicaments = new Medicament[2];

        clients[0] = new Client("Malfichu",0.0);
        clients[1] = new Client("Palichon",0.0);

        medicaments[0] = new Medicament("Aspiron", 20.40, 5);
        medicaments[1] = new Medicament("Rhinoplexil",19.15, 5);
        int choix;

        do {
            choix = menu();

            switch (choix) {
                case 1 :
                    achat(clients, medicaments);
                    break;
                case 2 :
                    approvisionnement(medicaments);
                    break;
                case 3 :
                    affichage(clients, medicaments);
                    break;
                case 4:
                    quitter();
            }
        }
        while (choix < 4);
    }
    // Les méthodes utilitaires

    static int menu() {
        int choix = 0;
        System.out.println();
        System.out.println();
        System.out.println("1 : Achat de médicament");
        System.out.println("2 : Approvisionnement en  médicaments");
        System.out.println("3 : Etats des stocks et des crédits");
        System.out.println("4 : Quitter");
        while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4)) {
            choix = scanner.nextInt();
        }
        return choix;
    }
    //  Méthodes auxiliaires à compléter

    static void affichage(Client[] clients, Medicament[] medicaments){
        System.out.println("Affichage des stocks");
        for (Medicament medicament: medicaments) {
            System.out.println("Stock du médicament " + medicament.getNom() + " : " + medicament.getStock());
        }

        System.out.println("Affichage des crédits");
        for (Client client: clients) {
            System.out.println("Crédit du client " + client.getNom() + " : " + client.getCredit());
        }
    }


    static void approvisionnement(Medicament[] medicaments){
        Medicament medicament = lireMedicament(medicaments);
        System.out.println("Donner la Quantité :");
        int quantite = scanner.nextInt();
        scanner.nextLine();
        medicament.augmenterStock(quantite);
    }

    static void achat(Client[] clients, Medicament[] medicaments){
        Client client = lireClient(clients);
        Medicament medicament = lireMedicament(medicaments);

        double paiement = lirePaiement();
        int quantite = lireQuantite();
        if (quantite <= medicament.getStock()){
            medicament.diminuerStock(quantite);
            client.augmenterCredit((medicament.getPrix() * quantite) - paiement);
        } else{
            System.out.println("Achat impossible. Quantité insuffisante !");
        }
    }

    static Client lireClient(Client[] clients){
        String nom;
        boolean trouve = false;
        Client c = null;
        System.out.println("Nom du client : ");

        do{
            nom = scanner.nextLine();
            for (int i = 0; (!trouve && i < clients.length); i++){
                if ((clients[i].getNom()).equalsIgnoreCase(nom)){
                    trouve = true;
                    c = clients[i];
                }
            }
            if (!trouve){
                System.out.println("Client inconnu. Veuillez recommencer !");
            }
        }while (!trouve);
        return c;
    }

    static Medicament lireMedicament(Medicament[] medicaments){
        String nom;
        boolean trouver = false;
        Medicament m = null;
        System.out.println("Nom du médicament : ");

        do {
            nom = scanner.nextLine();
            for (int i = 0; (!trouver && i < medicaments.length); i++){
                if (medicaments[i].getNom().equalsIgnoreCase(nom)){
                    trouver = true;
                    m = medicaments[i];
                }
            }
            if (!trouver){
                System.out.println("Médicament inconnu. Veuillez recommencer !");
            }
        }while (!trouver);

        return m;
    }

    static double lirePaiement(){
        double paiement;
        System.out.println("quel est le montant du paiement ?");
        paiement = scanner.nextDouble();
        scanner.nextLine();
        return paiement;
    }

    static int lireQuantite(){
        int qty;
        System.out.println("quelle est la quantité achetée ?");
        qty = scanner.nextInt();
        scanner.nextLine();
        return qty;
    }

    static void quitter(){
        System.out.println("Programme terminé !");
    }

}

// Autres classes à compléter
class Client{
    private String nom;
    private double credit;

    public Client(String nom, double credit){
        this.nom = nom;
        this.credit = credit;
    }

    public void augmenterCredit(double montant){
        credit += montant;
    }
    public void diminuerCredit(double montant){
        credit -= montant;
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }
}

class Medicament{
    private String nom;
    private double prix;
    private int stock;

    public Medicament(String nom, double prix, int stock) {
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    public void augmenterStock(int quantite){
        stock += quantite;
    }

    public void diminuerStock(int quantite){
        stock -= quantite;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}