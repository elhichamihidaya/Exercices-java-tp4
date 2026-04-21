package Ex2;

public class Voiture extends Vehicule{
	int nombredeportes;
	String carburant;
	
	public Voiture(String marque, int nombredeportes, String carburant) {
		super(marque);
		this.nombredeportes=nombredeportes;
		this.carburant=carburant;
	}
	public void afficherDetails() {
		afficherMarque();
        System.out.println("Portes: " + nombredeportes);
        System.out.println("Carburant: " + carburant);
	}
	public void klaxonner() {
		System.out.println("pip pip pip pip");
	}
}

