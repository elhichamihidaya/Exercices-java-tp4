package Ex3;

public class CompteCourant extends Compte{
    double decouvertAutorise;
    
	public CompteCourant(double solde,double decouvertAutorise) {
		super(solde);
		this.decouvertAutorise=decouvertAutorise;
	}
	
	public void autoriserDecouvert(double montant) {
        if (montant >= 0) {
            decouvertAutorise = montant;
            System.out.println("Découvert autorisé fixé à " + decouvertAutorise + " DH");
        } else {
            System.out.println("Montant invalide.");
        }
    }

    public void calculerFrais() {
        double frais = solde * 0.02;
        solde -= frais;
    }
    
    public void afficher() {
    	System.out.println("Compte Courant:");
        System.out.println("Solde: " + solde);
        System.out.println("Découvert autorisé: " + decouvertAutorise);
    }
}
