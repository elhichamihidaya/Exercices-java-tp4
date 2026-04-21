package Ex3;

public class CompteEpargne extends Compte {

    private double tauxInteret;

    public CompteEpargne(double solde, double tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }

    public double calculerInterets() {
        return solde * tauxInteret;
    }

    public void ajouterInterets() {
        solde += calculerInterets();
    }
    public void afficher() {
        System.out.println("Compte Épargne:");
        System.out.println("Solde: " + solde);
        System.out.println("Taux: " + tauxInteret);
    }
}
