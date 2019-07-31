package fr.banque;

public class Banque {

    public static void main(String[] args) {

        Client client1 = new Client("Pedro", "Genève", 'm', new ComptePrive(1000.00),
                new CompteEpargne(2000.00));
        Client client2 = new Client("Alexandra", "Lausanne", 'f', new ComptePrive(3000.00),
                new CompteEpargne(4000.00));
        System.out.println("Données avant le bouclement des comptes:");
        client1.afficherClient();
        client2.afficherClient();
        System.out.println("---------------");
        System.out.println("Données après le bouclement des comptes:");
        client1.boucler();
        client2.boucler();
        client1.afficherClient();
        client2.afficherClient();
    }
}

class Client {
    private String nom;
    private String ville;
    private char sexe;
    private ComptePrive comptePrive;
    private CompteEpargne compteEpargne;

    public Client(String nom, String ville, char sexe, ComptePrive comptePrive, CompteEpargne compteEpargne) {
        this.nom = nom;
        this.ville = ville;
        this.sexe = sexe;
        this.comptePrive = comptePrive;
        this.compteEpargne = compteEpargne;
    }

    public void afficherClient(){
        if (sexe == 'm')
            System.out.print("Client ");
        else
            System.out.print("Cliente ");
        System.out.println(nom + " de " + ville + "\n\tCompte privé :\t" + comptePrive.getSolde() + " francs" +
                "\n\tCompte epargne :\t" + compteEpargne.getSolde() + " francs");
    }

    public void boucler(){
        comptePrive.bouclerCompte();
        compteEpargne.bouclerCompte();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public ComptePrive getComptePrive() {
        return comptePrive;
    }

    public void setComptePrive(ComptePrive comptePrive) {
        this.comptePrive = comptePrive;
    }

    public CompteEpargne getCompteEpargne() {
        return compteEpargne;
    }

    public void setCompteEpargne(CompteEpargne compteEpargne) {
        this.compteEpargne = compteEpargne;
    }
}

abstract class Compte {
}

class ComptePrive extends Compte{
    private double solde;
    private static final double TAUX_PRIVE = 0.01;

    public ComptePrive(double solde) {
        this.solde = solde;
    }

    double bouclerCompte() {
        return solde += solde * TAUX_PRIVE;
    }

    public double getSolde() {
        return solde;
    }
}

class CompteEpargne extends Compte {
    private double solde;
    private static final double TAUX_EPARGNE = 0.02;

    public CompteEpargne(double solde) {
        this.solde = solde;
    }

    double bouclerCompte() {
        return solde += solde * TAUX_EPARGNE;
    }

    public double getSolde() {
        return solde;
    }
}
