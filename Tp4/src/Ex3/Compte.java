package Ex3;

public class Compte {
	double solde;
	public Compte(double solde) {
		this.solde=solde;
	}
	public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant !");
        }
    }
    public double consulterSolde() {
    	return solde;
    }

    public void afficher() {
        System.out.println("Solde: " + solde);
    }
}
